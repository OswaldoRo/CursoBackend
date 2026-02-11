package linkedlist;
/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar: Ana, Luis, Carlos, Maria, Pedro3️⃣ Eliminar "Luis"4️⃣ Mostrar la lista final usando for-each
5️⃣ ❌ No usar Scanner  📤 Salida esperada:
Ana
Carlos
Maria
Pedro
 */
import java.util.LinkedList;
public class Ejercicio5EliminarCondicionLinkedList {
    public static void main(String[] args){
        LinkedList<String>misNombres = new LinkedList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        misNombres.remove("Luis");

        for(String miListaNombres:misNombres){
            System.out.println(miListaNombres);
        }
    }
}
