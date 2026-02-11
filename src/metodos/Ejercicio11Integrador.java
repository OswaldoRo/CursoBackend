package metodos;
/*
Crear un metodo llamado procesarNombre que: Reciba un String nombre No devuelva nada (void) Si el nombre está vacío → imprima "Nombre inválido"
Si NO está vacío→ imprima "Hola,[nombre]" El mEtodo debe ser static Desde main, llamar al mEtodo con al menos dos pruebas:
una con texto vacío una con un nombre válido Pista MUY leve (sin solución)
Ya usaste algo parecido en el ejercicio 9 Aquí sí vas a necesitar un if
Pregúntate:
👉 ¿Qué condición hace que un texto esté vacío?
 */
public class Ejercicio11Integrador {
    public static void main(String [] args){
        procesarNombre("Oswaldo");
        procesarNombre("");
    }
    public static void procesarNombre(String nombre){
        if (nombre.isEmpty()){
            System.out.println("Nombre invalido");
            }
        else{
            System.out.println("Hola "+nombre);
        }

    }
}