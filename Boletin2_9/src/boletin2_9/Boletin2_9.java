
package boletin2_9;

import java.util.Scanner;
public class Boletin2_9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b100,b20,b5,m,euros;
            System.out.println("Introduce cantidad de euros:");
        euros = sc.nextInt();
        b100 = (euros/100);
        b20 = (euros%100)/20;
        b5 = ((euros%100)%20)/5;
        m = euros%100%20%5;
            System.out.println("La cantidad de dinero es "
                    +b100+" billetes de 100, "
                    +b20+" billetes de 20, "
                    +b5+" billetes de 5 y "
                    +m+" monedas de 1.");
        
            
            
            
            
            
            
    }
    
}
