package dev.etc;

public class App {
    public static void main(String[] args) {
        TablaMultiplicar tabla = new TablaMultiplicar();

        int numero = 2; 

        if (args.length > 0) {
            try {
                numero = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("El argumento debe ser un número entero. Usando 2 por defecto.");
            }
        }

        tabla.imprimirTabla(numero);
    }
}
