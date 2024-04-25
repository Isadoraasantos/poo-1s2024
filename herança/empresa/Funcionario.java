package herança.empresa;

public class Funcionario {
    
    protected String nome;
    protected Integer telefone;
    protected Integer cpf;
    protected Double salario;
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Double getBonificaco(){
        return this.salario * 0.35;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }
   
    

}
