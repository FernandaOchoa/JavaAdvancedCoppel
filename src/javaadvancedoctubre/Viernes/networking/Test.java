package javaadvancedoctubre.Viernes.networking;

import java.io.IOException;
import java.net.URL;

/*
IP: Es una direccion logica que puede ser cambiada
Esta compuesta por octetos en un rango de 0 a 255

Protocolo: Un conjunto de reglas asignadas a un noto
de un canal de comunicacion.
TCP, FTP, Telnet, SMTP, Pop

Numero de Puerto: Es usado para identificar diferentes
aplicaciones. (Endpoint), esta asociado a la direccion
IP

MAC: (Media Access Control) Direccion con identificador
unico NIC (Network Interface Controller).
Un canal puede tener multiples NIC pero cada uno tiene
una unica MAC.

Connection-Oriented: TCP
Connection-Less: UDP

Socket: Es un endpoint entre 2 vias de comunicacion.
Un socket es usado para la comunicacion entre aplicaciones
que poseen diferente JRE.

Java Sockets pueden usados para Connection Oriented
y Oriented-less

Connection - Oriented: Socket y ServerSocket
Connection-Less: DatagramSocket y DatagramPacket

En el cliente un socket debe tener dos datos.
1.- IP del Server
2.- Puerto

*/

public class Test {
    public static void main(String[] args) {
        
        try{
            URL url = new URL("http://www.codigofacilito.com");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
            
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
