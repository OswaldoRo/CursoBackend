package metodos;
/*
Crear un metodo llamado repetirMensaje que:Reciba:un String mensaje un int veces
No devuelva nada (void) Imprima el mensaje la cantidad de veces indicada Desde main, llamar al metodo
✅ El metodo debe ser static✅ Usar un for❌ No usar return✅ La impresión se hace dentro del metodo
 */
public class Ejercicio10RepetirMensaje {
    public static void main(String[] args){
    repetirMensaje("Oswaldo",5);
    }
    public static void repetirMensaje(String mensaje, int veces){
    for(int i = 0;i<veces;i++){
        System.out.println(mensaje);
    }
    }
}
