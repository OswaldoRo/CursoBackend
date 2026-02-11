package linkedlist;
/*
1️⃣ Crear un LinkedList<String> 2️⃣ Agregar los nombres: Ana, Luis, Carlos, Maria, Pedro
3️⃣ Obtener el primer elemento de la lista4️⃣ Obtener el último elemento de la lista
5️⃣ Mostrar ambos por pantalla6️⃣ ❌ No usar Scanner7️⃣ ❌ No usar Iterator explícito
📤 Salida esperada (ejemplo)
Primer elemento: Ana
Último elemento: Pedro
 */
import java.util.LinkedList;
public class Ejercicio7PrimerUltimoLinkedList {
    public static void main(String[] args){
        String primerElemento;
        String ultimoElemento;
        LinkedList<String>misNombres = new LinkedList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        primerElemento = misNombres.getFirst();
        System.out.println("Primer elemento: "+primerElemento);

        ultimoElemento = misNombres.getLast();
        System.out.println("Ultimo elemento: "+ultimoElemento);

    }
}
