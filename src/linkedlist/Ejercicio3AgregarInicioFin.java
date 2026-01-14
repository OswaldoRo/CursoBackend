package linkedlist;
/*
📌 Consigna
1️⃣ Crear un LinkedList<String>2️⃣ Agregar los nombres:Luis Carlos 3️⃣ Agregar "Ana" al inicio 4️⃣ Agregar "Maria" al final
5️⃣ Mostrar la lista final con for-each6️⃣ ❌ No usar Scanner
📤 Salida esperada
Ana
Luis
Carlos
Maria
 */
import java.util.LinkedList;
public class Ejercicio3AgregarInicioFin {
    public static void main(String[] args){
        LinkedList<String>misNombres = new LinkedList<>();
        misNombres.add("Luis");
        misNombres.add("Carlos");

        misNombres.addFirst("Ana");
        misNombres.addLast("Maria");

        for(String listaNombres:misNombres){
            System.out.println(listaNombres);
        }
    }
}
