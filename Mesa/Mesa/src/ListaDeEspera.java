
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase ListaDeEspera
class ListaDeEspera {
    private List<Cliente> clientesEnEspera;
    private Map<Cliente, Long> tiempoMaximoEnEspera;

    public ListaDeEspera() {
        this.clientesEnEspera = new ArrayList<>();
        this.tiempoMaximoEnEspera = new HashMap<>();
    }

    public void agregarAEspera(Cliente cliente, int duracionEnMinutos) {
        this.clientesEnEspera.add(cliente);
        this.tiempoMaximoEnEspera.put(cliente, System.currentTimeMillis() + duracionEnMinutos * 60000);
        System.out.println("Cliente " + cliente.getNombre() + " agregado a la lista de espera.");
    }

    public void removerDeEspera(Cliente cliente) {
        this.clientesEnEspera.remove(cliente);
        this.tiempoMaximoEnEspera.remove(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " removido de la lista de espera.");
    }

    public void limpiarListaDeEspera() {
        this.clientesEnEspera.clear();
        this.tiempoMaximoEnEspera.clear();
    }

    public void obtenerTiempoEstimado(){
        for (Cliente cliente : this.clientesEnEspera) {
            long tiempoRestante = this.tiempoMaximoEnEspera.get(cliente) - System.currentTimeMillis();
            if (tiempoRestante <= 0) {
                System.out.println("Cliente " + cliente.getNombre() + " ha excedido el tiempo máximo en espera.");
                this.removerDeEspera(cliente);
            } else {
                System.out.println("Cliente " + cliente.getNombre() + " ha estado en espera por " + tiempoRestante / 60000 + " minutos.");
            }
        }
    }
}
