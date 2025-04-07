public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }
}
