package linkedlist;
/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar los nombres: Ana Luis Carlos Maria
3️⃣ Eliminar el nombre "Carlos" 4️⃣ Mostrar la lista final usando for-each 5️⃣ ❌ No usar Scanner
6️⃣ ❌ No usar Iterator explícito
 */
import java.util.LinkedList;
public class Ejercicio2EliminarLinkedList {
    public static void main(String[] args){
        LinkedList<String>misNombres = new LinkedList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");

        misNombres.remove("Carlos");

        for(String listaNombres:misNombres){
            System.out.println(listaNombres);
        }
    }
}
