package arraylist;
/*
1️⃣ Crear un ArrayList<String>2️⃣ Agregar los nombres:Ana Luis Carlos Maria Pedro
3️⃣ Mostrar el mensaje: La lista tiene X elementos 4️⃣ Mostrar todos los nombres uno por uno
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio6ContarElementos {
    public static void main (String[] args){
        int elementos=0;
        ArrayList<String>misNombres = new ArrayList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        System.out.println("La lista tiene "+ misNombres.size() +" elementos");

        for(int i = 0;i < misNombres.size();i++){
            System.out.println(misNombres.get(i));
        }
    }
}
