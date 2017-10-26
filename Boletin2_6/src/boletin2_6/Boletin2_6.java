
package boletin2_6;

import java.util.Scanner;
public class Boletin2_6 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        float pp,pt,pf;
            System.out.println("Introduce precio pagado: ");
            pp = sc.nextFloat();
            System.out.println("Introduce el precio de la tarifa: ");
            pt = sc.nextFloat();            
        pf = 100-(pp*100/pt);
            System.out.println("El precio final es "+pf);
    
        
    }
    
}
