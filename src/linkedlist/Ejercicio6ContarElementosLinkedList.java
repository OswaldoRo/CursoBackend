package linkedlist;
/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar: Ana, Luis, Carlos, Maria, Pedro3️⃣ Contar cuántos elementos tiene la lista sin usar size() directamente en el println
4️⃣ Mostrar el total5️⃣ ❌ No usar Scanner6️⃣ ❌ No usar Iterator explícito 📤 Salida esperada (ejemplo)
Total de elementos: 5
🎯 Pistas (muy suaves)
Usa un contador Recorre la lista con for-each Incrementa el contador en cada vuelta
 */
import java.util.LinkedList;
public class Ejercicio6ContarElementosLinkedList {
    public static void main(String[] args){
        int contador = 0;
        LinkedList<String>misNombres = new LinkedList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        for(String listaNombres:misNombres){
            contador++;

        }
        System.out.println("Total de elementos: "+contador);
    }
}
