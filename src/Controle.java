public class Controle {

    private final Empregado[] empregados = new Empregado[5];
    private int index = 0;

    public void inserirEmpegrado(Empregado empregado) {
        this.empregados[index++] = empregado;
    }

    public Empregado pesquisar(long matricula) {
        for (Empregado empregado : empregados) {
            if (matricula == empregado.matricula) {
                return empregado;
            }
        }
        return null;
    }

    public String listarEmpregados() {
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += empregados[i] +"\n";
            aux += "Salário: R$" + empregados[i].calcularSalario() + "\n";
        }
        return aux;
    }
}
