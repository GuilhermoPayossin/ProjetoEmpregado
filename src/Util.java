import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private Controle controle = new Controle();

    public void menu() {
        String aux = """
                -----------------
                1 - Cadastrar
                2 - Pesquisar
                3 - Listar
                4 - Finalizar
                -----------------
                """;
        int opcao;

        while (true) {
            opcao = parseInt(showInputDialog(aux));
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    showMessageDialog(null, "Encerrando o programa");
                    return;
                default:
                    showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    private void listar() {
        showMessageDialog(null, controle.listarEmpregados());
    }

    private void pesquisar() {
        Empregado empregado = controle.pesquisar(parseLong(showInputDialog("Digite o valor da matricula")));
        if (empregado == null) {
            showMessageDialog(null, "Empregado não encontrado");
        } else {
            showMessageDialog(null, empregado);
        }
    }

    private void cadastrar() {
        String nome;
        long matricula;
        int totalDeHorasTrabalhadas;
        double valorDaHoraTrabalhada, totalDeVendas, comissao;

        String aux = """
                ------------------------------
                1 - Empregado Horista
                2 - Empregado Comissionado
                3 - Sair
                ------------------------------
                """;
        int opcao;

        while (true) {
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 3) {
                return;
            }
            if (opcao == 1 || opcao == 2) {
                matricula = parseLong(showInputDialog("Digite a matricula do Empregado"));
                nome = showInputDialog("Digite o nome do Empregado");
                if (opcao == 1) {
                    totalDeHorasTrabalhadas = parseInt(showInputDialog("Digite o total de horas trabalhadas"));
                    valorDaHoraTrabalhada = parseDouble(showInputDialog("Digite o valor da hora trabalhada"));
                    EmpregadoHorista empregadoHorista = new EmpregadoHorista(matricula, nome,
                            totalDeHorasTrabalhadas, valorDaHoraTrabalhada);
                    controle.inserirEmpegrado(empregadoHorista);
                } else {
                    totalDeVendas = parseDouble(showInputDialog("Digite o total de vendas"));
                    comissao = parseDouble(showInputDialog("Digite a porcentagem da comissao"));
                    EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado(matricula, nome,
                            totalDeVendas, comissao);
                    controle.inserirEmpegrado(empregadoComissionado);
                }
            } else {
                showMessageDialog(null, "Opção inválida");
            }
        }
    }
}
