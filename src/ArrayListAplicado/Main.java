package ArrayListAplicado;

public class Main {
        public static void main(String[] args) {

            UsuarioService.agregarUsuario(new Usuario(1, "Ana", "ana@mail.com"));
            UsuarioService.agregarUsuario(new Usuario(2, "Luis", "luis@mail.com"));

            // GET
            for (Usuario u : UsuarioService.listarUsuarios()) {
                System.out.println(u.getId() + " " + u.getNombre());
            }

            // PUT
            UsuarioService.actualizarUsuario(1, "Ana Maria");

            // DELETE
            UsuarioService.eliminarUsuario(2);
        }
    }

