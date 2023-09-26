/**
 * @author (Nesma Abouzaid) 
 * @version (6/20/2023)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        //Start codon is "ATG"
        //Stop Codon is "TAA"        
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){ //No ATG
            return "";
        }
        
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1){ //No TAA
            return "";
        }
        
        result = dna.substring(startIndex, stopIndex+3);
        if (((stopIndex+3)-startIndex)%3 == 0){
           return result;
        }
         return "";
    }

    public void testFindGeneSimple(){
        //Not multiple of 3
        String dna = "ATGTCGACCGAAATAA";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        //No ATG
        dna = "TGTCGACCGAAATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        //No TAA        
        dna = "ATGTGTCTGAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        //Correct
        dna = "ATGCGATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        
        
    }
}
