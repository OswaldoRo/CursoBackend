package metodos;
/*
Crear un metodo que:1️⃣ Se llame sumar2️⃣ Reciba dos números enteros (int a, int b)3️⃣ Devuelva la suma de los dos números
4️⃣ Desde main, llamar al método5️⃣ Imprimir el resultado por pantalla
✅ Usar return
❌ No imprimir dentro del metodo sumar
✅ La impresión se hace solo en main
✅ El metodo debe ser static
 */
public class Ejercicio3Suma {
    public static void main(String[] args){
        System.out.println(sumar(2,2));
    }
    public static int sumar(int a,int b){
        return a+b;
    }
}
