package Trabalho2;

public class Professor extends Pessoa {
    private Double salario;
    private String disciplina;

    public Professor(String nome, Integer matricula, Integer telefone, String turno, Double salario, String disciplina) {
        super(nome, matricula, telefone, turno);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public Double getBonificacao() {
        return salario * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salario='" + salario + "'" +
                ", disciplina='" + disciplina + "'";
    }
}

    

