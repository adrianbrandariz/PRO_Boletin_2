
package boletin2_4;

import java.util.Scanner;
public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,suma,resta,producto,division;
            System.out.println("Introduce el primer valor:");
        n1 = sc.nextFloat();
            System.out.println("Introduce el segundo valor:");
        n2 = sc.nextFloat();
        suma = n1+n2;
        resta = n1-n2;
        producto = n1*n2;
        division = n1/n2;
            System.out.println("La suma es= "+suma);
            System.out.println("La resta es= "+resta);
            System.out.println("El producto es= "+producto);
            System.out.println("La division es= "+division);
    }
    
}
