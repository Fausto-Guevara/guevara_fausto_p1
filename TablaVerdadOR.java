/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 15-Marzo-2024 
 */


public class TablaVerdadOR {

    public static void main(String[] args) {
        // Definimos los valores de verdad
        boolean[] valores = {true, false};
        
        // Imprimimos el encabezado de la tabla
        System.out.println("Tabla de verdad del OR (||):");
        System.out.println("--------------------------");
        System.out.println("| A | B | A || B |");
        System.out.println("--------------------------");

        // Se genera e imprime cada fila de la tabla
        for (boolean a : valores) {
            for (boolean b : valores) {
                char charA = a ? 'T' : 'F';
                char charB = b ? 'T' : 'F';
                boolean resultado = a || b;
                System.out.printf("| %c | %c | %-7s |\n", charA, charB, resultado);
            }
        }
        
        System.out.println("--------------------------");
    }
}
