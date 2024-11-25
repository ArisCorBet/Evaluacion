import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Mesa {
    private String identificador;
    private int numeroAsientos;
    private String ubicacion;
    private List<Mesa> mesasUnidas;
    private LocalDateTime horaDisponible;
    private EstadoMesa estado;

    public Mesa(String identificador, int numeroAsientos, String ubicacion) {
        this.identificador = identificador;
        this.numeroAsientos = numeroAsientos;
        this.ubicacion = ubicacion;
        this.mesasUnidas = new ArrayList<>();
        this.horaDisponible = LocalDateTime.now();
        this.estado = EstadoMesa.LIBRE;
    }

    public void cambiarEstado(EstadoMesa nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void liberarMesa() {
        this.estado = EstadoMesa.LIBRE;
    }

    public void unirMesa(Mesa otraMesa) {
        this.mesasUnidas.add(otraMesa);
    }

    public boolean validarDisponibilidad(LocalDateTime fecha) {
        return this.horaDisponible.isBefore(fecha);
    }

    public String getIdentificador() {
        return identificador;
    }

    public EstadoMesa getEstado() {
        return estado;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public String getUbicacion() {
        return ubicacion; // Add this getter method
    }
}

