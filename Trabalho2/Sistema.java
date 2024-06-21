package Trabalho2;

public class Sistema {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Elizabeta", 34256189, 784563, "vespertino", "000000");
        Coordenador coordenador = new Coordenador("Amelia", 32213030, 563427, "matutino", 20000.0, "projetos");
        Diretor diretor = new Diretor("Alfredo", 33218181, 123456, "matutino", 30000.0, "administrativo");
        Professor professor = new Professor("Cornelio", 40028922, 834789, "noturno", 15000.0, "Sociologia");
        
        // Exibir informações usando polimorfismo
        System.out.println("Informações do Aluno:");
        System.out.println(aluno);
        System.out.println("Bonificação do Aluno: " + aluno.getBonificacao());
        
        System.out.println("\nInformações do Coordenador:");
        System.out.println(coordenador);
        System.out.println("Bonificação do Coordenador: " + coordenador.getBonificacao());
        
        System.out.println("\nInformações do Diretor:");
        System.out.println(diretor);
        System.out.println("Bonificação do Diretor: " + diretor.getBonificacao());
        
        System.out.println("\nInformações do Professor:");
        System.out.println(professor);
        System.out.println("Bonificação do Professor: " + professor.getBonificacao());
    }
}

    

