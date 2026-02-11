package metodos;
/*
1️⃣ crea un metodo que se llame mostrarTabla2️⃣ Reciba un número entero (int numero)3️⃣ No devuelva nada (void)
4️⃣ Imprima la tabla de multiplicar del número del 1 al 10
5️⃣ Desde main, llamar al metodo
📤 Ejemplo de salida (si el número es 5)
5 x 1 = 5
5 x 2 = 10
5 x 10 = 50
✅ El metodo debe ser void❌ No usar return✅ Usar un for✅ El metodo debe ser static
 */
public class Ejercicio7TablaMultiplicar {
    public static void main(String[] args){
        mostrarTabla(5);
    }
    public static void mostrarTabla(int numero){
        int resultado;
        for(int i = 1;i<=10;i++){
            resultado=numero*(i);
            System.out.println(resultado);
        }
    }
}
