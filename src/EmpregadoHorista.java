public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorPorHora;

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorPorHora;
    }
}
