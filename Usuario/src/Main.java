public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setUsername("admin");
        usuario.setCorreo("admin@empresa.com");
        usuario.setNivel(3);
        usuario.activar();

        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Activo: " + usuario.isActivo());

       
        usuario.setUsername("");
        usuario.setCorreo("");
        usuario.setNivel(-1);

        System.out.println("--- Datos inválidos ---");
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());

        usuario.desactivar();
        System.out.println("Activo tras desactivar(): " + usuario.isActivo());
    }
}