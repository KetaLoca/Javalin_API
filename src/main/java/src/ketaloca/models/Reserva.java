package src.ketaloca.models;

public class Reserva {
    private String id, userEmail, alojamientoId, fechaInicio, fechaFin;

    public Reserva(String id, String userEmail, String alojamientoId, String fechaInicio, String fechaFin) {
        this.id = id;
        this.userEmail = userEmail;
        this.alojamientoId = alojamientoId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAlojamientoId() {
        return alojamientoId;
    }

    public void setAlojamientoId(String alojamientoId) {
        this.alojamientoId = alojamientoId;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
