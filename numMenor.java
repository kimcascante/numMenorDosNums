package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Calcule el menor de dos números.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej7w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        int numero1;
        int numero2;
        String numeroMayor;

        escribir.println("Digite el primer numero");
        numero1 = Integer.parseInt(leer.readLine());

        escribir.println("Digite el segundo numero");
        numero2 = Integer.parseInt(leer.readLine());

        if (numero1 == numero2){
            numeroMayor = "No hay numero mayor, ambos numeros son iguales, el numero " + numero1;
        } else if (numero1 > numero2){
            numeroMayor = "El numero menor es " + numero2;
        } else {
            numeroMayor = "El numero menor es " + numero1;
        }

        escribir.println(numeroMayor);
    }
}