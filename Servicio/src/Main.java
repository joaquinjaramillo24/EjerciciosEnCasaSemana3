public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        servicio.setNombre("API de pagos");
        servicio.setPuerto(8080);
        servicio.iniciar();

        servicio.registrarPeticion();
        servicio.registrarPeticion();
        servicio.registrarPeticion();

        System.out.println("Servicio: " + servicio.getNombre());
        System.out.println("Puerto: " + servicio.getPuerto());
        System.out.println("Activo: " + servicio.isActivo());
        System.out.println("Peticiones: " + servicio.getCantidadPeticiones());


        servicio.setNombre("");
        servicio.setPuerto(0);
        servicio.setCantidadPeticiones(-5);

        System.out.println("--- Datos inválidos ---");
        System.out.println("Servicio: " + servicio.getNombre());
        System.out.println("Puerto: " + servicio.getPuerto());
        System.out.println("Peticiones: " + servicio.getCantidadPeticiones());

        servicio.detener();
        System.out.println("Activo tras detener(): " + servicio.isActivo());
    }
}