/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 15-Marzo-2024 
 */


import java.util.Scanner;

public class CuadradoInscrito {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el valor del lado del cuadrado mayor
        System.out.print("Ingrese el valor del lado del cuadrado mayor (ℓ): ");
        double l = scanner.nextDouble();
        
        // Calcular el lado del cuadrado inscrito
        double ladoCuadradoInscrito = l / Math.sqrt(2);
        
        // Calcular el perímetro del cuadrado inscrito
        double perimetro = 4 * ladoCuadradoInscrito;
        
        // Imprimir el resultado
        System.out.printf("El perímetro del cuadrado inscrito es: %.2f\n", perimetro);
          
        scanner.close();
    }
}
