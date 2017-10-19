package javaadvancedoctubre.Miercoles.excepciones;

public class Test2 {
    public static void main(String[] args) {
       try{
        int a[]= new int[5];
        a[5]= 30/0;
        a[6]=1;
       }catch(ArithmeticException ae){
           System.out.println(ae);
       } catch(ArrayIndexOutOfBoundsException aioe){
           System.out.println(aioe);
       } catch(Exception e){
           System.out.println(e);
       }
        System.out.println("Lo que sigue");
    }
}
