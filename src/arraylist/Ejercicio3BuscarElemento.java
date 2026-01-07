package arraylist;
/*
1️⃣ Crear un ArrayList<String> 2️⃣ Agregar estos nombres: Ana, Luis, Carlos, Maria, Pedro
3️⃣ Pedir al usuario un nombre con Scanner4️⃣ Verificar si el nombre existe en la lista
5️⃣ Mostrar:"Nombre encontrado" o "Nombre no encontrado"
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio3BuscarElemento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        boolean encontrado = false;
        ArrayList<String>misNombres = new ArrayList<String>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");
        misNombres.add("Pedro");

        System.out.println("Por favor ingrese el nombre que esta buscando: ");
        nombre = entrada.nextLine();

        for(int i = 0; i<misNombres.size();i++) {
            if (misNombres.get(i).equals(nombre)) {
                encontrado = true;
            }
        }
        System.out.println(nombre);
        if(encontrado == true){
            System.out.println("Nombre encontrado");
        }
        else{
            System.out.println("Nombre no encontrado");
        }
    }

}

