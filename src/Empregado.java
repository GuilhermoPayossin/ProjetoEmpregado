public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getDados() {
        return "Nome: " + nome +
                "\nMatricula: " + matricula;
    }
}
