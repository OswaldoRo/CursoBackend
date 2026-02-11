package metodos;
/*
🟢 Ejercicio 2 — Metodo con parámetro
Metodo saludarNombre(String nombre)
Imprime: Hola, [nombre]
 */
public class Ejercicio2SaludoPersonalizado {
    public static void main(String[] args){
        System.out.println(saludarNombre("Oswaldo"));
    }
    public static String saludarNombre(String nombre){
        return "hola" + nombre;
    }
}
