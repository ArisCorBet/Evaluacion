
public interface INotificador {
    void notificarMesaDisponible(int idMesa);
    void notificarReservaCreada(Reserva reserva);
    void notificarReservaCancelada(Reserva reserva);
    void notificarTiempoEspera(int tiempoEstimado);
    void notificarMesaAsignada();
}
