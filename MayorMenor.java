package CursoJava;

import java.util.Scanner;

// Ejercicio #1 de Java Curso Lucas Moy
public class MayorMenor {
    

   public static void main(String[] args){

        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            int numero1 = sc.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int numero2 = sc.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int numero3 = sc.nextInt();

             // Establecemos 
            Integer mayor = numero1;
            Integer menor = numero1;

            if(numero2 > mayor){
                mayor = numero2;
            } 
            if(numero3 > mayor){
                mayor = numero3;
            }
            if (numero2 < menor){
                menor = numero2;
            }
            if(numero3 < menor){
                menor = numero3;
            }

            System.out.println("El número mayor es: "+mayor);
            System.out.println("El número menor es: "+menor);
        }
   }
    




}
