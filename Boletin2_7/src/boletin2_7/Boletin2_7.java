
package boletin2_7;

import java.util.Scanner;
public class Boletin2_7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float celsius,kelvin,faren;
            System.out.println("Introduce grados Celsius:");
        celsius = sc.nextFloat();
        kelvin = celsius+273;
        faren = (32+(1.8f*celsius));
            System.out.println("Grados Kelvin = "+kelvin);
            System.out.println("Grados Farenheit = "+faren);
        
        
        
    }
    
}
