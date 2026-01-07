package arraylist;
/*
1️⃣ Crear un ArrayList<String>2️⃣ Agregar: Ana, Luis, Carlos, Maria, Pedro 3️⃣ Pedir al usuario: nombre a modificar
nuevo nombre4️⃣ Si existe → modificarlo5️⃣ Mostrar:"Nombre modificado""Nombre no encontrado"6️⃣ Mostrar la lista final
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio5ModificarElemento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String modificado;
        boolean modificar = false;

        ArrayList<String>misNombres=new ArrayList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        System.out.println("Que nombre desea modificar ?");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el nuevo nombre: ");
        modificado = entrada.nextLine();

        for(int i = 0;i < misNombres.size();i++){
            if(misNombres.get(i).equals(nombre)){
                misNombres.set(i,modificado);
                modificar=true;
                break;
            }
        }
        if(modificar){
            System.out.println("Nombre modificado");
        }
        else{
            System.out.println("Nombre no encontrado");
        }
        for(int i =0;i<misNombres.size();i++){
            System.out.println(misNombres.get(i));
        }
        entrada.close();
    }
}
