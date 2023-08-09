public class Habitacion {
    private int numero;
    private Cliente cliente;

    public Habitacion(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void liberarHabitacion() {
        cliente = null;
    }

    public boolean estaOcupada() {
        return cliente != null;
    }

    @Override
    public String toString() {
        if (cliente != null) {
            return "Habitación " + numero + ": Ocupada por " + cliente.getNombre() + " (" + cliente.getCedula() + ")";
        } else {
            return "Habitación " + numero + ": Disponible";
        }
    }
}
