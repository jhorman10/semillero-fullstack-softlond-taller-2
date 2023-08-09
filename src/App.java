public class App {
    public static void main(String[] args) throws Exception {

        //Ejercio 1
        SistemaAlumnos sistema = new SistemaAlumnos();

        sistema.agregarAlumno("Juan", 18);
        sistema.agregarAlumno("María", 19);

        sistema.asignarCalificacion("Juan", 8.5);
        sistema.asignarCalificacion("Juan", 9.0);
        sistema.asignarCalificacion("María", 7.8);

        sistema.mostrarInformacionAlumnos();

        System.out.println("*************************************************");
        //Ejercicio 2
        ConversorMonedas conversor = new ConversorMonedas(0.85, 20.0);

        double dolares = 100.0;
        double euros = conversor.convertirDolaresAEuros(dolares);
        System.out.println(dolares + " dólares equivalen a " + euros + " euros.");

        double pesos = 2000.0;
        double dolaresDesdePesos = conversor.convertirPesosADolares(pesos);
        System.out.println(pesos + " pesos equivalen a " + dolaresDesdePesos + " dólares.");
        System.out.println("*************************************************");

        //Ejercicio 3
        Calculadora calculadora = new Calculadora();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Suma: " + calculadora.sumar(num1, num2));
        System.out.println("Resta: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));
        
        try {
            System.out.println("División: " + calculadora.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("*************************************************");

        //Ejercicio 4
        Cliente cliente1 = new Cliente("Empresa A", "123456789");
        Cliente cliente2 = new Cliente("Empresa B", "987654321");
        
        Hotel hotel1 = new Hotel("Hotel X", 5);
        Hotel hotel2 = new Hotel("Hotel Y", 7);

        hotel1.reservarHabitacion(cliente1, 2);
        hotel2.reservarHabitacion(cliente2, 3);
        hotel2.reservarHabitacion(cliente1, 5);

        Reserva reserva1 = new Reserva(cliente1, hotel1, 2);
        Reserva reserva2 = new Reserva(cliente2, hotel2, 3);
        Reserva reserva3 = new Reserva(cliente1, hotel2, 5);

        System.out.println("Información de Reservas:\n");
        System.out.println(reserva1.toString() + "\n");
        System.out.println(reserva2.toString() + "\n");
        System.out.println(reserva3.toString() + "\n");

        System.out.println("Estado de Habitaciones:\n");
        System.out.println(hotel1.toString() + "\n");
        System.out.println(hotel2.toString());
    }
}
