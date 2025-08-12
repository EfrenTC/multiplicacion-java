package dev.etc;
import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

    public List<String> generarTabla(int n) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tabla.add(n + " x " + i + " = " + (n * i));
        }
        return tabla;
    }
    public void imprimirTabla(int n) {
        List<String> tabla = generarTabla(n);
        tabla.forEach(System.out::println);
    }
    public static void main(String[] args) {
        TablaMultiplicar tm = new TablaMultiplicar();
        tm.imprimirTabla(5); 
    }
}
