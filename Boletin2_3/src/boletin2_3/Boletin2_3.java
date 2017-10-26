
package boletin2_3;

import java.util.Scanner;
public class Boletin2_3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float euros,cambio,dolares;
                System.out.println("Teclea euros:");
            euros = sc.nextFloat();
                System.out.println("Teclea cambio:");
            cambio = sc.nextFloat();
            dolares = euros*cambio;
                System.out.println(euros + " euros son "+ dolares +" dolares.");
        
        
        
        
        
        
        
    }
    
}
