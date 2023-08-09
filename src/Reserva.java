public class Reserva {
    private Cliente cliente;
    private Hotel hotel;
    private int numHabitacion;

    public Reserva(Cliente cliente, Hotel hotel, int numHabitacion) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.numHabitacion = numHabitacion;
    }

    @Override
    public String toString() {
        return "Empresa: " + cliente.getNombre() + "\n" +
                "Nombre y cédula del huésped: " + cliente.toString() + "\n" +
                "Número de habitación: " + numHabitacion;
    }
}
