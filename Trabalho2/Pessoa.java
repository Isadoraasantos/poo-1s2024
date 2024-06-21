package Trabalho2;

public class Pessoa {
    protected String nome;
    protected Integer matricula;
    protected Integer telefone;
    protected String turno;

    public Pessoa(String nome, Integer matricula, Integer telefone, String turno) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.turno = turno;
    }

    // Métodos getters e setters para os atributos comuns
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Método abstrato para calcular bonificação
    public Double getBonificacao() {
        return 0.0; // Implementação específica em cada subclasse
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + nome + "'" +
                ", matricula='" + matricula + "'" +
                ", telefone='" + telefone + "'" +
                ", turno='" + turno + "'" +
                "}";
    }
}
