package linkedlist;
/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar los nombres:Ana Luis Carlos Maria Pedro
3️⃣ Buscar el nombre "Maria" 4️⃣ Si existe, reemplazarlo por "María Gómez"5️⃣ Mostrar la lista final usando for-each
❌ No usar Scanner❌ No usar Iterator explícito❌ No usar números fijos para posiciones
✅ Usar for con índice✅ Usar get() y set()✅ Usar equals()
🖥️ Salida esperada (ejemplo)
Ana
Luis
Carlos
María Gómez
Pedro
 */
import java.util.LinkedList;
public class Ejercicio9IntegradorLinkedList {
    public static void main(String[] args){
    LinkedList<String>misNombres = new LinkedList<>();
    misNombres.add("Ana");
    misNombres.add("Luis");
    misNombres.add("Carlos");
    misNombres.add("Maria");
    misNombres.add("Pedro");

    for(int i = 0;i<misNombres.size();i++){
        if(misNombres.get(i).equals("Maria")){
            misNombres.set(i,"Maria Gómez");
        }
    }
        System.out.println("Mis nombres son: ");
    for(String listaNombres:misNombres){
        System.out.println(listaNombres);
        }
    }
}
