public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Tienda Web");
        proyecto.setResponsable("Ana");

        System.out.println("Proyecto: " + proyecto.getNombre()
                + " | Responsable: " + proyecto.getResponsable());
        System.out.println("Progreso inicial: " + proyecto.getProgreso());

        proyecto.avanzar(30);
        System.out.println("Tras avanzar(30): " + proyecto.getProgreso());

        proyecto.avanzar(50);
        System.out.println("Tras avanzar(50): " + proyecto.getProgreso()
                + " | terminado: " + proyecto.isTerminado());

        proyecto.avanzar(50);   // 80 + 50 = 130, pero se limita a 100
        System.out.println("Tras avanzar(50): " + proyecto.getProgreso()
                + " | terminado: " + proyecto.isTerminado());

        proyecto.setProgreso(150);   // inválido
        System.out.println("Tras setProgreso(150): " + proyecto.getProgreso());

        proyecto.avanzar(-10);       // inválido
        System.out.println("Tras avanzar(-10): " + proyecto.getProgreso());
    }
}