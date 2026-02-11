package metodos;
/*
Crear un metodo que:️⃣ Se llame esMayorDeEdad2️⃣ Reciba un número entero (int edad)3️⃣ Devuelva:"Mayor de edad" si la edad es 18 o más
"Menor de edad" si es menor de 184️⃣ Desde main, llamar al método5️⃣ Imprimir el resultado por pantalla
❗ Reglas
✅ El metodo debe devolver un String✅ Usar if / else❌ No imprimir dentro del metodo
✅ La impresión se hace solo en main✅ El metodo debe ser static
 */
public class Ejercicio6MayorMenor {
    public static void main(String[] args){
        System.out.println(esMayorDeEdad(17));
    }
    public static String esMayorDeEdad(int edad){
        if(edad >= 18){
            return "Mayor de edad";
        }
        else {
            return "Menor de edad";
        }
    }
}
