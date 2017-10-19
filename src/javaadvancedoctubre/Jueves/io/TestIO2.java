package javaadvancedoctubre.Jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = 
                    new FileOutputStream("C:\\b.txt");
            String s = "Hola Mundo Archivos";
            byte b[] = s.getBytes();
            
            System.out.println("Listo");
            fout.write(b);
            fout.close();
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
