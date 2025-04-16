import java.util.ArrayList;

public class AminoAcid {
    private String fullName;               // For the full big ugly names of the amino acids
    private String abbreviation;           // For the one-letter codes of the amino acid
    private ArrayList<String> codons;      // For all codons that can code for this amino acid
    private ArrayList<Integer> codonCounter; // For the total number of times each codon was seen in the genome

    // Constructor to create a new AminoAcid object with a full name and abbreviation
    public AminoAcid(String name, String code)
    {
        fullName = name;                   // Set the full name
        abbreviation = code;               // Set the abbreviation
        codons = new ArrayList<String>();  // Create a new list to hold codons
        codonCounter = new ArrayList<Integer>(); // Create a new list to hold counts for each codon
    }

    // Method to add a codon to the list of codons for this amino acid
    public void addCodon(String codon)
    {
        codons.add(codon);                 // Adds the codon to the codons list
        codonCounter.add(0);                // Initializes its count to 0 in the codonCounts list
    }

    // Method to increase the count of a specific codon by 1
    public void incrementCodon(String codon)
    {
        for (int i = 0; i < codons.size(); i++)
        {                                                // Loop through the list of codons
            if (codons.get(i).equals(codon))
            {                                              // If the codon matches one in the list
                codonCounter.set(i, codonCounter.get(i) + 1); // Increase its count by 1
                break;                                   // Stops searching once we've updated the right codon
            }
        }
    }

    // Method to calculate the total number of times this amino acid appears (all codon counts added together)
    public int getTotalCount()
    {
        int total = 0;                       // Start total at 0
        for (int count : codonCounter)
        {                                    // For each codon count in the list
            total += count;                  // Adds it to the total
        }
        return total;                        // Return the total count
    }

    // Method to get the full name of this amino acid
    public String getFullName()
    {
        return fullName;                     // Return the full name
    }

    // Method to get the abbreviation of this amino acid
    public String getAbbreviation()
    {
        return abbreviation;                 // Return the abbreviation
    }

    // Method to get the list of codons for this amino acid
    public ArrayList<String> getCodons()
    {
        return codons;                       // Return the list of codons
    }

    // Method to get the list of codon counts for this amino acid
    public ArrayList<Integer> getCodonCounter()
    {
        return codonCounter;                  // Return the list of codon counts
    }
}