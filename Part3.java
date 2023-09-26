
/**
 * @author (Nesma Abouzaid) 
 * @version (6/20/2023)
 */
public class Part3 {
    public boolean twoOccurrences (String stringa, String stringb){
        int index1 = stringb.indexOf(stringa);
        if(index1 !=-1){
            int index2 = stringb.indexOf(stringa, index1+1);
            if(index2 !=-1){
                return true;
            } else {
                return false;
            }
        }
        return false;        
    }
    
    public String lastPart (String stringa, String stringb){
        String result = "";
        int indexOcc = stringb.indexOf(stringa);
        if(indexOcc != -1){
           result = stringb.substring(indexOcc+stringa.length(), stringb.length()); 
        }else{
             result = stringb;
        }
        return result;
    }
    
    public void testing(){
  
        System.out.println(twoOccurrences("a","banana"));
        System.out.println(twoOccurrences("by","A story by Abby Long"));
        System.out.println(twoOccurrences("atg","ctgtatgta"));
        
        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forest"));
        System.out.println(lastPart("zoo", "farzookeeper"));
    }
    
}
