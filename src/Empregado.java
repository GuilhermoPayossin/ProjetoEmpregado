public abstract class Empregado {
    long matricula;
    String nome;

    public double calcularSalario() {
        return 0.0;
    }

    public String getDados() {
        return "Nome: " + nome +
                "\nMatricula: " + matricula;
    }
}
