package metodos;
/*
Crear un metodo que:1️⃣ Se llame contarCaracteres2️⃣ Reciba un String texto3️⃣ Devuelva la cantidad de caracteres del texto
4️⃣ Desde main, llamar al metodo5️⃣ Imprimir el resultado por pantalla
✅ El metodo debe devolver un int✅ Usar return❌ No imprimir dentro del metodo✅ La impresión se hace solo en main
✅ El metodo debe ser static
 */
public class Ejercicio5LongitudTexto {
    public static void main(String[] args){
        System.out.println(contarCaracteres("Oswaldo"));
    }
    public static int contarCaracteres(String texto){
        return texto.length();
    }
}
