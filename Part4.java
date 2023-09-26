
/**
 * @author (Nesma Abouzaid) 
 * @version (6/20/2023)
 */

import edu.duke.*;

public class Part4 {
    public void printUrls(String url){
        URLResource myurl = new URLResource(url);
        for(String word : myurl.words()){
            if (word.toLowerCase().indexOf("youtube.com") != -1){
                int quoteIndex = word.indexOf("\"");
                int lastQuoteIndex = word.indexOf("\"", quoteIndex+1);
                System.out.println(word.substring(quoteIndex+1, lastQuoteIndex)); 
            
        }
    }
    
}

public void testUrl(){
    printUrls("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
}
}

