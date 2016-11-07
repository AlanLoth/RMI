

import java.util.Scanner;

public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();
            Scanner sc = new Scanner(System.in);
            System.out.println("num1");
            float x = sc.nextFloat();
            System.out.println("num2");
            float y = sc.nextFloat();
            float suma = wsc.getSuma(x, y);
            float reata = wsc.getResta(x, y);
            float multi = wsc.getMulti(x, y);
            float divi = wsc.getDivi(x, y);
            float are = wsc.getAre(x, y);
            double pow = wsc.getPow(x, y);
            
             System.out.println(" resultado de la suma por el servidor: " + suma);
             System.out.println(" resultado de la resta por el servidor: " + reata);
             System.out.println(" resultado de la multiplicacion por el servidor: " + multi);
             System.out.println(" resultado de la divicion por el servidor: " + divi);
             System.out.println(" resultado de la area de rectangulo por el servidor: " + are);
             System.out.println(" resultado de la elevacion por el servidor: " + pow);
     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}