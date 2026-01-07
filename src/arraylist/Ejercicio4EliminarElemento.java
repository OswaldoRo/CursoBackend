package arraylist;
/*
1️⃣ Crear un ArrayList<String>,2️⃣ Agregar: Ana, Luis, Carlos, Maria, Pedro,3️⃣ Pedir al usuario un nombre a eliminar,
4️⃣ Si existe → eliminarlo;5️⃣ Mostrar:"Nombre eliminado" "Nombre no encontrado": 6️⃣ Mostrar la lista final
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4EliminarElemento{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean eliminar = false;
        String nombre;
        ArrayList<String>misNombres = new ArrayList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        System.out.println("Ingrese el nombre que desea eliminar: ");
        nombre = entrada.nextLine();

        for(int i = 0;i<misNombres.size();i++){
            if(misNombres.get(i).equals(nombre)){
             misNombres.remove(i);
             eliminar = true;
             break;
            }
        }
        if(eliminar){
            System.out.println("El nombre ha sido eliminado con exito");
        }
        else{
            System.out.println("Nombre no encontrado");
        }

        for(int i=0;i<misNombres.size();i++){
            System.out.println(misNombres.get(i));
        }
        entrada.close();
    }
}