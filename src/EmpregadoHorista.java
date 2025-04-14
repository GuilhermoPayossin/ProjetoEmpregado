public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorPorHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorPorHora) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String getDados() {
        return super.getDados() +
                "\nHoras Trabalhadas: " + totalDeHorasTrabalhadas +
                "\nValor por Hora: R$" + valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorPorHora;
    }
}
