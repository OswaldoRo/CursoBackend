package arraylist;
/*
1️⃣ Crear un ArrayList<String>
2️⃣ Agregar 5 nombres directamente (sin Scanner)
3️⃣ Mostrar todos los nombres usando for-each
4️⃣ Imprimir el mensaje:
 */
import java .util.ArrayList;
public class Ejercicio2RecorrerForEach {
    public static void main(String[] args){
        ArrayList<String>misNombres = new ArrayList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria ");
        misNombres.add("Pedro");

        System.out.println("Listado de nombres:");
        for(String lista:misNombres){
            System.out.println(lista);
        }
    }
}
