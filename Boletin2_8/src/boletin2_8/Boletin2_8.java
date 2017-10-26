
package boletin2_8;

import java.util.Scanner;
public class Boletin2_8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int b100,b20,b5,m,euros;
            System.out.println("Introduce numero de billetes de 100 euros:");
        b100 = sc.nextInt();
            System.out.println("Introduce numero de billetes de 20 euros:");
        b20 = sc.nextInt();
            System.out.println("Introduce numero de billetes de 5 euros:");
        b5 = sc.nextInt();
            System.out.println("Introduce numero de monedas de 1 euro:");
        m = sc.nextInt();
        euros = (b100*100)+(b20*20)+(b5*5)+m;
            System.out.println("La cantidad de euros son: "+euros);
        
        
    }
    
}
