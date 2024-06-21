package Trabalho2;

public class Coordenador extends Pessoa {
    private Double salario;
    private String area;

    public Coordenador(String nome, Integer matricula, Integer telefone, String turno, Double salario, String area) {
        super(nome, matricula, telefone, turno);
        this.salario = salario;
        this.area = area;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public Double getBonificacao() {
        return salario * 0.2;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salario='" + salario + "'" +
                ", area='" + area + "'";
    }
}

    

