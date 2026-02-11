package ArrayListAplicado;

import java.util.ArrayList;

    public class UsuarioService {

        private static ArrayList<Usuario> usuarios = new ArrayList<>();

        // CREATE (POST)
        public static void agregarUsuario(Usuario usuario) {
            if(usuarios.isEmpty()){
                System.out.println("Error esta vacio");
            }else{
                usuarios.add(usuario);
            }
        }

        // READ (GET)
        public static ArrayList<Usuario> listarUsuarios() {
            return usuarios;
        }

        // UPDATE (PUT)
        public static boolean actualizarUsuario(int id, String nuevoNombre) {
            for (Usuario u : usuarios) {
                if (u.getId() == id) {
                    u.setNombre(nuevoNombre);
                    return true;
                }
            }
            return false;
        }

        // DELETE (DELETE)
        public static boolean eliminarUsuario(int id) {
            for (Usuario u : usuarios) {
                if (u.getId() == id) {
                    usuarios.remove(u);
                    return true;
                }
            }
            return false;
        }
    }

