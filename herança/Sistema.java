package herança;

import heranca.empresa.Engenheiro;

   
    public class Sistema { // implementa main, public static...
    
        public static void main(String[] args) {
            Engenheiro eng1 = new Engenheiro("Joao", 123, 123, "crea 1", "Orientação a Objeto", 150000.0);
    
            Engenheiro eng2 = new Engenheiro("Pedro", 124, 124, "crea 2", "Orientação a Objeto", 150000.0);
        
            Gerente ger1 = new Gerente("JP", 125, 125, 200000.0, 2);

            System.out.println(eng1);
            System.out.println(eng1);
        
       }
         
        
    } 

