
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase ListaDeEspera
class ListaDeEspera {
    private List<Cliente> clientesEnEspera;
    private Map<Cliente, Long> tiempoExpiracion;

    public ListaDeEspera() {
        this.clientesEnEspera = new ArrayList<>();
        this.tiempoExpiracion = new HashMap<>();
    }

    public void agregarAEspera(Cliente cliente, int duracionEnMinutos) {
        this.clientesEnEspera.add(cliente);
        this.tiempoExpiracion.put(cliente, System.currentTimeMillis() + duracionEnMinutos * 60000);
        System.out.println("Cliente " + cliente.getNombre() + " agregado a la lista de espera.");
    }

    public void removerDeEspera(Cliente cliente) {
        this.clientesEnEspera.remove(cliente);
        this.tiempoExpiracion.remove(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " removido de la lista de espera.");
    }

    public void limpiarListaDeEspera() {
        this.clientesEnEspera.clear();
        this.tiempoExpiracion.clear();
    }
}
