package metodos;
/*
Crear un metodo llamado convertirMayusculas que:Reciba un String texto como parámetro Devuelva el texto convertido a mayúsculas
No imprima nada dentro del metodo Desde el main: Definir una variable String con un texto
Llamar al metodo Mostrar por pantalla el valor devuelto
 */
public class Ejercicio8ConvertirMayuscula {
    public static void main(String[] args){
        System.out.println(convertirMayusculas("oswaldo"));
    }
    public static String convertirMayusculas(String texto){
    return texto.toUpperCase();
    }
}
