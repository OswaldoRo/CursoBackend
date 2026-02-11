package metodos;
/*
1️⃣ Se llame esPar 2️⃣ Reciba un número entero (int numero)3️⃣ Devuelva true si el número es par4️⃣ Devuelva false si el número es impar
5️⃣ Desde main, llamar al método6️⃣ Imprimir el resultado por pantalla
✅ El metodo debe retornar boolean ✅ Usar return ❌ No imprimir dentro del metodo esPar
✅ La impresión se hace solo en main ✅ El metodo debe ser static
 */
public class Ejercicio4EsPar {
    public static void main(String[] args){
        System.out.println(esPar(5));
    }
    public static boolean esPar(int numero){
        if(numero%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
