package linkedlist;
/*
Requisitos:1️⃣ Crear un LinkedList<String>2️⃣ Agregar: Ana, Luis, Carlos, Maria3️⃣ Mostrar todos los elementos usando for
4️⃣ No usar Scanner
📤 Salida esperada (ejemplo):Ana Luis Carlos Maria
 */
import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
public class Ejercicio1LinkedListBasico {
    public static void main(String[] args){
        LinkedList<String>misNombres = new LinkedList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");


        System.out.println("Elementos for:");
        for(int i=0;i < misNombres.size();i++){
            System.out.println(misNombres.get(i));
        }

        System.out.println("Elementos for each:");
        for(String listaNombres:misNombres){
            System.out.println(listaNombres);
        }
    }
}
