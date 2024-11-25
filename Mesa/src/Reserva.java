import java.time.LocalDate;
import java.time.LocalDateTime;

class Reserva {
    private String identificador;
    private int cantidadPersonas;
    private LocalDate fechaReserva;
    private LocalDateTime horaInicio;
    private LocalDateTime horaReservaFinalizada;
    private EstadoReserva estado;

    public Reserva(String identificador, int cantidadPersonas, LocalDate fechaReserva, LocalDateTime horaInicio) {
        this.identificador = identificador;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaReservaFinalizada = horaInicio.plusHours(2); // Ejemplo: reserva dura 2 horas
        this.estado = EstadoReserva.ENCURSO;

    }

    public void modificarReserva(Reserva nuevosDatos) {
        this.cantidadPersonas = nuevosDatos.cantidadPersonas;
        this.fechaReserva = nuevosDatos.fechaReserva;
        this.horaInicio = nuevosDatos.horaInicio;
        this.horaReservaFinalizada = nuevosDatos.horaReservaFinalizada;
        this.estado = nuevosDatos.estado;
    }

    public boolean verificarDisponibilidad(Mesa mesa, LocalDateTime fecha) {
        return mesa.validarDisponibilidad(fecha);
    }

    public void finalizarReserva() {
        this.estado = EstadoReserva.FINALIZADA;
    }

    public String getIdentificador() {
        return identificador;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva; // Add this getter method
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio; // Add this getter method
    }
}

