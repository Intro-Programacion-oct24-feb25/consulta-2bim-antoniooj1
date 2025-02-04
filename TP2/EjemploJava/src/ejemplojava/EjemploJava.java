/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplojava;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class EjemploJava {

    /**
     * @param args the command line arguments
     */
         public static int suma(int n) {
        if (n == 1) return 1;
        return n + suma(n - 1); 
    }

    public static void main(String[] args) {
        System.out.println("La suma de los números del 1 al 5 es: " + suma(5));
    }
}