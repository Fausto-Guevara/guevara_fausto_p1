/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 15-Marzo-2024 
 */

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        // Definir la constante pi
        final double PI = Math.PI;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el valor del radio
        System.out.print("Ingrese el valor del radio del círculo: ");
        double r = scanner.nextDouble();
        
        // Calcular el área del círculo
        double area = (PI * Math.pow(r, 2)) / 2;
        
        // Calcular el perímetro del círculo
        double perimetro = 2 * PI * r;
        
        // Imprimir los resultados
        System.out.printf("El área del círculo es: %.2f\n", area);
        System.out.printf("El perímetro del círculo es: %.2f\n", perimetro);
        
        // Cerrar el scanner
        scanner.close();
    }
}
