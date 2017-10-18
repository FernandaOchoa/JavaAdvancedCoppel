
package javaadvancedoctubre.Lunes.banco;

public class Banco {
    float getTasaDeInteres(){
        return 0;
    }
}
class SBI extends Banco {
    float getTasaDeInteres(){
        return 8.4f;
    }
}

class ICICI extends Banco {
    float getTasaDeInteres(){
        return 7.3f;
    }
}

class AXIS extends Banco {
    float getTasaDeInteres(){
        return 9.7f;
    }
}

class Test{
    public static void main(String[] args) {
        //Redefinicion
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        
        System.out.println("SBI tasa de interes: "+s.getTasaDeInteres());
        System.out.println("ICICI tasa de interes: "+i.getTasaDeInteres());
        System.out.println("AXIS tasa de interes: "+a.getTasaDeInteres());
    
    }
}