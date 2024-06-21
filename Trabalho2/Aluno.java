package Trabalho2;

public class Aluno extends Pessoa {
    private String turma;

    public Aluno(String nome, Integer matricula, Integer telefone, String turno, String turma) {
        super(nome, matricula, telefone, turno);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return super.toString() + ", turma='" + turma + "'";
    }
}
