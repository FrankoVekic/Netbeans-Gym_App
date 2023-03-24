/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import us.codecraft.xsoup.Xsoup;

/**
 *
 */
public class Helper {
    
    public static String generateOib(){
        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
        } catch (Exception e) {
        }
        return "";
        
    }
    
/*
    private static String createOib() {
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        String s = "";
        
          for(int i = 0; i < 11; i++){
            Random r = new Random();
            int a = r.nextInt(9);
            s = s+ num[a];         
        }
          return s;
    }*/
    
}
