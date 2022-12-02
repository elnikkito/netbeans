package ej18;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         int suma=0;
         
         for(int c=1 ; c<=5 ; c++){
             suma=suma+(c*c);
         }
         System.out.println("La suma de los 5 primeros numeros naturales es: "+suma);
    }
}
