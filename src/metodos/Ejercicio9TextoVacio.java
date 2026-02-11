package metodos;
/*
1️⃣ Reciba un String texto2️⃣ Devuelva true si el texto está vacío3️⃣ Devuelva false si el texto NO está vacío
4️⃣ Desde main, llamar al metodo5️⃣ Imprimir el resultado por pantalla
✅ El metodo debe devolver boolean
✅ Usar return
❌ No imprimir dentro del metodo
✅ La impresión se hace solo en main
✅ El metodo debe ser static
 */

public class Ejercicio9TextoVacio {
    public static void main(String[] args){
        System.out.println(textoVacio("Oswaldo"));
    }
    public static boolean textoVacio(String texto){
        return texto.isEmpty();
    }
}
