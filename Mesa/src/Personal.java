// Clase Personal
class Personal extends Persona implements INotificador {
    private String identificadorPersonal;
    private Rol rol;

    public Personal(String nombre, String cedulaPersona, String email, String telefono, String identificadorPersonal, Rol rol) {
        super(nombre, cedulaPersona, email, telefono);
        this.identificadorPersonal = identificadorPersonal;
        this.rol = rol;
    }

    public void asignarMesa(Cliente cliente, Mesa mesa) {
        System.out.println("Mesa " + mesa.getIdentificador() + " asignada al cliente " + cliente.getNombre());
    }

    @Override
    public void notificarMesaDisponible(int idMesa) {
        System.out.println("Mesa " + idMesa + " está disponible.");
    }

    @Override
    public void notificarReservaCreada(Reserva reserva) {
        System.out.println("Reserva creada: " + reserva.getIdentificador());
    }

    @Override
    public void notificarReservaCancelada(Reserva reserva) {
        System.out.println("Reserva cancelada: " + reserva.getIdentificador());
    }

    @Override
    public void notificarTiempoEspera(int tiempoEstimado) {
        System.out.println("Tiempo de espera estimado: " + tiempoEstimado + " minutos.");
    }

    @Override
    public void notificarMesaAsignada() {
        System.out.println("Mesa asignada correctamente.");
    }
}

