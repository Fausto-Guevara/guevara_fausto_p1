/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 15-Marzo-2024 
 */


public class NegarValor {

    // Método que niega el valor de verdad de entrada
    public static boolean negarValor(boolean valor) {
        // Negar el valor de entrada usando el operador !
        return !valor;
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        // Probar la función con varios valores
        System.out.println(negarValor(true));  // Debería devolver false
        System.out.println(negarValor(false)); // Debería devolver true
    }
}
