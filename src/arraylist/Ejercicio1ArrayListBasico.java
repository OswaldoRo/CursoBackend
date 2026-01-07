package arraylist;
/*Crear un ArrayList donde se agregen 5 nombres y se muestren por pantala
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio1ArrayListBasico {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombres;

        ArrayList<String>listaNombres = new ArrayList<String>();
        //Agregar nombres

        System.out.println("Por favor ingrese 5 nombres: ");
            for(int i = 0;i < 5;i++){
                System.out.print("Nombre " + (i + 1) + ": ");
                nombres=entrada.nextLine();
                listaNombres.add(nombres);
        }
        System.out.println("======LOS NOMBRES AGREGADOS SON======");
            for(int i = 0;i<listaNombres.size();i++){
                System.out.println(listaNombres.get(i));

            entrada.close();
        }
    }
}