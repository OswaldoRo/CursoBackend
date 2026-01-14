package arraylist;
/*
1️⃣ Crear un ArrayList<String>2️⃣ Agregar los nombres:Ana Luis Carlos Maria Pedro
3️⃣ Mostrar el primer elemento de la lista 4️⃣ Mostrar el último elemento de la lista
❗ Restricciones ❌ No usar números fijos (no escribir 0 ni 4) ❌ No recorrer la lista con bucles ✅ Usar get()
✅ Usar size()
 */
import java.sql.SQLOutput;
import java.util.ArrayList;
public class Ejercicio8PrimerUltimo {
        public static void main(String[] args){
            int primerElemento;
            int ultimoElemento;
            int tamañoLista;

            ArrayList<String>misNombres = new ArrayList<String>();
            misNombres.add("Ana");
            misNombres.add("Luis");
            misNombres.add("Carlos");
            misNombres.add("Maria");
            misNombres.add("Pedro");

            tamañoLista = misNombres.size();
            System.out.println("Tamaño lista: ");
            System.out.println(tamañoLista);

            primerElemento = 0;
            System.out.println("El primer elemento de la lista es: " + misNombres.get(primerElemento));

            ultimoElemento = misNombres.size() - 1;
            System.out.println("El ultimo elemento de la lista es: " + misNombres.get(ultimoElemento));

        }
}