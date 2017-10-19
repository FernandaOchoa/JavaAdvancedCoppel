package javaadvancedoctubre.Martes.interfaces.pruebas;

import javaadvancedoctubre.Martes.interfaces.Bank;

class SBI implements Bank{
    public float getRateOfInterest(){
        return 9.15f;
    }
}
class PNB implements Bank{
    public float getRateOfInterest(){
        return 9.7f;
    }
}
class ICICI implements Bank {
    public float getRateOfInterest(){
        return 8.3f;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Bank b= new SBI();
        System.out.println("ROI: "+b.getRateOfInterest());
    }
    
}
