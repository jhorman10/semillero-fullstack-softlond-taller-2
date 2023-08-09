public class ConversorMonedas {
    private double tasaDolarAEuro;
    private double tasaDolarAPeso;

    public ConversorMonedas(double tasaDolarAEuro, double tasaDolarAPeso) {
        this.tasaDolarAEuro = tasaDolarAEuro;
        this.tasaDolarAPeso = tasaDolarAPeso;
    }

    public double convertirDolaresAEuros(double cantidad) {
        return cantidad * tasaDolarAEuro;
    }

    public double convertirDolaresAPesos(double cantidad) {
        return cantidad * tasaDolarAPeso;
    }

    public double convertirEurosADolares(double cantidad) {
        return cantidad / tasaDolarAEuro;
    }

    public double convertirPesosADolares(double cantidad) {
        return cantidad / tasaDolarAPeso;
    }
}
