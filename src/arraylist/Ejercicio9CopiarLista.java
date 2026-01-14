package arraylist;
/*
1️⃣ Crear un ArrayList<String> llamado listaOriginal 2️⃣ Agregar los nombres:Ana Luis Carlos Maria Pedro
3️⃣ Crear un segundo ArrayList<String> vacío llamado listaCopia 4️⃣ Copiar todos los elementos de listaOriginal a listaCopia
5️⃣ Mostrar el contenido de listaCopia
❗ Restricciones ❌ No usar addAll()
❌ No usar métodos avanzados ✅ Usar un bucle ✅ Usar get() y add() ❌ No modificar la lista original
🖥️ Salida esperada (ejemplo)
Ana Luis Carlos Maria Pedro
 */
import java.util.ArrayList;
public class Ejercicio9CopiarLista {
    public static void main(String[] args){
        ArrayList<String>listaOriginal = new ArrayList<>();
        listaOriginal.add("Ana");
        listaOriginal.add("Luis");
        listaOriginal.add("Carlos");
        listaOriginal.add("Maria");
        listaOriginal.add("Pedro");

        ArrayList<String>listaCopia = new ArrayList<>();

        for(int i=0;i<listaOriginal.size();i++){
            listaCopia.add(listaOriginal.get(i));
        }
        System.out.println("La lista copia es :");
        for(int i =0;i<listaCopia.size();i++){
            System.out.println(listaCopia.get(i));
        }
    }
}
