import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear algunas mesas
        Mesa mesa1 = new Mesa("M1", 4, "Terraza");
        Mesa mesa2 = new Mesa("M2", 2, "Interior");
        Mesa mesa3 = new Mesa("M3", 6, "VIP");

        System.out.println("Mesas creadas:");
        System.out.println("Mesa 1 - ID: " + mesa1.getIdentificador() + ", Asientos: " + mesa1.getNumeroAsientos() + ", Ubicación: " + mesa1.getUbicacion());
        System.out.println("Mesa 2 - ID: " + mesa2.getIdentificador() + ", Asientos: " + mesa2.getNumeroAsientos() + ", Ubicación: " + mesa2.getUbicacion());
        System.out.println("Mesa 3 - ID: " + mesa3.getIdentificador() + ", Asientos: " + mesa3.getNumeroAsientos() + ", Ubicación: " + mesa3.getUbicacion());

        // Cambiar el estado de una mesa
        mesa1.cambiarEstado(EstadoMesa.RESERVADA);
        System.out.println("Estado de la mesa 1 cambiado a: " + mesa1.getEstado());

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "123456789", "juan.perez@gmail.com", "555-1234");
        Cliente cliente2 = new Cliente("Ana Lopez", "987654321", "ana.lopez@gmail.com", "555-5678");

        // Lista de espera
        ListaDeEspera listaDeEspera = new ListaDeEspera();
        System.out.println("Lista de espera creada.");


        // Agregar cliente a la lista de espera
        listaDeEspera.agregarAEspera(cliente2, 15);
        System.out.println("Cliente " + cliente2.getNombre() + " agregado a la lista de espera por 15 minutos.");
        System.out.println("Cliente " + cliente1.getNombre() + " agregado a la lista de espera por 15 minutos.");
        // Remover de la lista de espera
        listaDeEspera.removerDeEspera(cliente2);
        System.out.println("Cliente " + cliente1.getNombre() + " removido de la lista de espera.");


        System.out.println("Clientes creados:");
        System.out.println("Cliente 1 - Nombre: " + cliente1.getNombre() + ", Email: " + cliente1.getEmail() + ", Teléfono: " + cliente1.getTelefono());
        System.out.println("Cliente 2 - Nombre: " + cliente2.getNombre() + ", Email: " + cliente2.getEmail() + ", Teléfono: " + cliente2.getTelefono());



        // Crear reservas
        Reserva reserva1 = new Reserva("R1", 4, LocalDate.now(), LocalDateTime.now().plusHours(1));
        Reserva reserva2 = new Reserva("R2", 2, LocalDate.now(), LocalDateTime.now().plusHours(2));

        System.out.println("Reservas creadas:");
        System.out.println("Reserva 1 - ID: " + reserva1.getIdentificador() + ", Fecha: " + reserva1.getFechaReserva() + ", Hora inicio: " + reserva1.getHoraInicio());
        System.out.println("Reserva 2 - ID: " + reserva2.getIdentificador() + ", Fecha: " + reserva2.getFechaReserva() + ", Hora inicio: " + reserva2.getHoraInicio());

        // Asociar reservas con clientes
        cliente1.hacerReserva(reserva1);
        cliente2.hacerReserva(reserva2);

        System.out.println("Reservas asociadas a clientes:");
        System.out.println("Cliente 1 - Reserva: " + reserva1.getIdentificador());
        System.out.println("Cliente 2 - Reserva: " + reserva2.getIdentificador());

        // Mostrar información de las reservas
        System.out.println("Reservas del cliente 1:");
        for (Reserva r : cliente1.verReservas()) {
            System.out.println("ID: " + r.getIdentificador() + ", Estado: " + r.getEstado());
        }

        System.out.println("Reservas del cliente 2:");
        for (Reserva r : cliente2.verReservas()) {
            System.out.println("ID: " + r.getIdentificador() + ", Estado: " + r.getEstado());
        }

        // Crear personal
        Personal mesero1 = new Personal("Carlos Ruiz", "654321987", "carlos.ruiz@gmail.com", "555-7890", "P1", Rol.MESERO);

        System.out.println("Personal creado:");
        System.out.println("Mesero 1 - Nombre: " + mesero1.getNombre() + ", Email: " + mesero1.getEmail() + ", Teléfono: " + mesero1.getTelefono());

        // Asignar una mesa
        mesero1.asignarMesa(cliente1, mesa1);
        System.out.println("Mesa asignada: " + mesa1.getIdentificador() + " al cliente: " + cliente1.getNombre());

        // Consultar disponibilidad de una mesa
        cliente1.consultarDisponibilidad(mesa2, LocalDateTime.now().plusHours(3));

        // Modificar reserva
        Reserva nuevaReserva = new Reserva("R1", 5, LocalDate.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(1));
        reserva1.modificarReserva(nuevaReserva);
        System.out.println("Reserva modificada. Nuevo estado: " + reserva1.getEstado());
    }
}







