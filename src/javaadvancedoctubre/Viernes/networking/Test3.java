package javaadvancedoctubre.Viernes.networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class Test3 {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.codigofacilito.com");
            HttpURLConnection huc = (HttpURLConnection)
                    url.openConnection();
            for(int i =1; i<=8; i++){
                System.out.println(huc.getHeaderFieldKey(i)
                +" = "+huc.getHeaderField(i));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
