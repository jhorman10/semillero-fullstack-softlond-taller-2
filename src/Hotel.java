import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int numHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        for (int i = 1; i <= numHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.estaOcupada()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public boolean reservarHabitacion(Cliente cliente, int numHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numHabitacion && !habitacion.estaOcupada()) {
                habitacion.asignarCliente(cliente);
                return true;
            }
        }
        return false;
    }

    public void cancelarReserva(int numHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numHabitacion) {
                habitacion.liberarHabitacion();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Hotel: " + nombre + "\n");
        for (Habitacion habitacion : habitaciones) {
            info.append(habitacion.toString()).append("\n");
        }
        return info.toString();
    }
}
