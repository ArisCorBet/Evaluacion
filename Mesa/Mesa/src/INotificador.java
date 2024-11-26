
public interface INotificador {
    public void notificarMesaDisponible(int idMesa);
    public void notificarReservaCreada(Reserva reserva);
    public void notificarReservaCancelada(Reserva reserva);
    public void notificarTiempoEspera(int tiempoEstimado);
    public void notificarMesaAsignada();
    public void notificarReservaFinalizada();


}
