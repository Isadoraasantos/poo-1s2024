package Trabalho2;

public class Diretor extends Pessoa {
    private Double salario;
    private String setor;

    public Diretor(String nome, Integer matricula, Integer telefone, String turno, Double salario, String setor) {
        super(nome, matricula, telefone, turno);
        this.salario = salario;
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public Double getBonificacao() {
        return salario * 0.3;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salario='" + salario + "'" +
                ", setor='" + setor + "'";
    }
}

