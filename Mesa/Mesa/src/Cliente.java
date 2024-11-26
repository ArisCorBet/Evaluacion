
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

// Clase Cliente
class Cliente extends Persona implements IReserva {
    private List<Reserva> reservaList;

    public Cliente(String nombre, String cedulaPersona, String email, String telefono) {
        super(nombre, cedulaPersona, email, telefono);
        this.reservaList = new ArrayList<>();
    }


    public void actualizarInformacion() {
        System.out.println("Información del cliente actualizada.");
    }

    public List<Reserva> verReservas() {
        return this.reservaList;
    }

    public void consultarDisponibilidad(Mesa mesa, LocalDateTime fecha) {
        if (mesa.validarDisponibilidad(fecha)) {
            System.out.println("Mesa disponible para la fecha solicitada.");
        } else {
            System.out.println("Mesa no disponible para la fecha solicitada.");
        }
    }

    @Override
    public void hacerReserva(Reserva reserva) {
        this.reservaList.add(reserva);
        System.out.println("Reserva realizada: " + reserva.getIdentificador());
    }

    @Override
    public void modificarReserva(Reserva reserva) {
        System.out.println("Reserva modificada: " + reserva.getIdentificador());
    }

    @Override
    public void cancelarReserva(Reserva reserva) {
        this.reservaList.remove(reserva);
        System.out.println("Reserva cancelada: " + reserva.getIdentificador());
    }
}




