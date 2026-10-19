public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    // El progreso solo puede estar entre 0 y 100
    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            this.terminado = (this.progreso == 100);
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    // El progreso nunca debe superar 100
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            this.progreso = this.progreso + porcentaje;
            if (this.progreso > 100) {
                this.progreso = 100;
            }
            this.terminado = (this.progreso == 100);
        }
    }
}