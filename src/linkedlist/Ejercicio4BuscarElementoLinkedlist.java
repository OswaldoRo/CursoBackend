package linkedlist;
/*
1️⃣ Crear un LinkedList<String>2️⃣ Agregar: Ana, Luis, Carlos, Maria3️⃣ Verificar si existe "Pedro"
4️⃣ Si existe → mostrar "Encontrado"5️⃣ Si NO existe → mostrar "No encontrado"6️⃣ ❌ No usar Scanner
📤 Salida esperada:
No encontrado
 */
import java.util.LinkedList;
public class Ejercicio4BuscarElementoLinkedlist {
    public static void main(String[] args){
        boolean buscar=false;
        LinkedList<String>misNombres = new LinkedList<>();
        misNombres.add("Ana");
        misNombres.add("Luis");
        misNombres.add("Carlos");
        misNombres.add("Maria");

        for(String miLista:misNombres){
            if(miLista.equals("Pedro")){
                buscar = true;
                break;
            }
        }
        if(buscar){
            System.out.println("Encontrado");
        }
        else{
            System.out.println("No encontrado");
        }
    }
}
