import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupReviewSample
{


/**
 * Example program to list links from a URL.
  * @throws IOException 
  */
 
     public static void main(String[] args) throws IOException {  
     // URL to Scrape (found by going to an Amazon product page and clicking on Show Reviews)
     // Select a review to see what kind of css classes are defined.  For Example:
     
     
      Document  doc = Jsoup.connect("https://www.amazon.com/Advanced-Health-Healthy-Digestion-Chicken/dp/B09QF3CRD1?ref_=ast_sto_dp&th=1")
      .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
      .referrer("http://www.google.com")
      .get();
        
       
       

        System.out.println("\nReviews: ");
         
        // The following will print out text contained in all span elements.  You may have to parse further to clean
        for (Element e : doc.select("span")) {
            System.out.println(e.text());
        }

    }

   
}