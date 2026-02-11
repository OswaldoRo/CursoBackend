package linkedlist;

import java.util.LinkedList;

/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar los nombres: Ana, Luis, Carlos, Maria, Pedro3️⃣ Reemplazar el nombre "Carlos" por "Juan"
4️⃣ Mostrar la lista final usando for-each5️⃣ ❌ No usar Scanner6️⃣ ❌ No usar Iterator explícito
📤 Salida esperada
Ana
Luis
Juan
Maria
Pedro
 */
public class Ejercicio8RemplazarElementoLinkedList {
    public static void main(String[] args) {
        String remplazar = "Juan";
        LinkedList<String> misNombres = new LinkedList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        for(int i = 0;i < misNombres.size();i++){
            if(misNombres.equals("Carlos"))
            misNombres.set(i,"Juan");
        }

        for (String MostrarNombres : misNombres) {
            System.out.println(MostrarNombres);
        }
    }
}
