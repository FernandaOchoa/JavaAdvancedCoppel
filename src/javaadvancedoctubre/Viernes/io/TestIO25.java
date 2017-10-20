package javaadvancedoctubre.Viernes.io;

//Des-Serializacion

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestIO25 {
    public static void main(String[] args){
        try{
            ObjectInputStream in = null;
            in =  new ObjectInputStream(new
                FileInputStream("C:\\t.txt"));
            
            TestIO24 t =(TestIO24)in.readObject();
            System.out.println(t.id+" "+t.nameClass);
        }catch(IOException ioe){
            ioe.printStackTrace();
        } catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
            
        }
    }
}
