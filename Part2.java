
/**
 * @author (Nesma Abouzaid) 
 * @version (6/20/2023)
 */
public class Part2 {
    
    
    
        public String findSimpleGeneModified (String dna, String startCodon, String stopCodon) {
        //Start codon is "ATG"
        //Stop Codon is "TAA"        
        String result = "";
        if ( Character.isUpperCase(dna.charAt(0)) ){
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
            
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
            
        }
        
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1){ //No ATG
            return "";
        }
        
        int stopIndex = dna.indexOf(stopCodon, startIndex+3);
        if (stopIndex == -1){ //No TAA
            return "";
        } else {
        
        result = dna.substring(startIndex, stopIndex+3);
        if (((stopIndex+3)-startIndex)%3 == 0){
           return result;
        }
    }
         return "";
    }

    public void testFindGeneSimple(){
        String gene;
        //Not multiple of 3
        String dna = "ATGTCGACCGAAATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGeneModified(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        //No ATG
        dna = "TGTCGACCGAAATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGeneModified(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        //No TAA        
        dna = "ATGTGTCTGAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGeneModified(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        //Correct
        dna = "ATGCGATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGeneModified(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        dna = "ATGCGCATATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGeneModified(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);     
        
    }
}

