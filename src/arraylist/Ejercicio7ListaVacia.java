package arraylist;
/*
1️⃣ Crear un ArrayList<String>2️⃣ NO agregar ningún elemento al inicio3️⃣ Verificar si la lista está vacía
4️⃣ Si está vacía, mostrar:La lista está vacía 5️⃣ Si NO está vacía, mostrar: La lista tiene elementos
❗ Restricciones ❌ No usar size() ✅ Usar isEmpty() ❌ No usar Scanner ✅ Solo lógica básica
 */
import java.util.ArrayList;
public class Ejercicio7ListaVacia {
    public static void main(String[] args){
        ArrayList<String>listaVacia = new ArrayList<>();

        if(listaVacia.isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            System.out.println("La lista tiene elementos");
        }
    }
}
