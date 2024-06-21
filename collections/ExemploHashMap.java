package collections;

import java.util.HashMap;

public class ExemploHashMap {
    
    public static void main(String[] args){
    
    HashMap<String, String> capitais = new HashMap<>();
     
    capitais.put("Brasil", "Brasilia");
    capitais.put("França", "Paris");
    capitais.put("Japao", "Tóquio");

    System.out.println(capitais.get("Brasil"));

        if(capitais.containsKey("França")){
            System.out.println("França está no HashMap.");
        }
    
        for (String chave: capitais.Keyset()){
            System.out.println(chave + " - " + capitais.get(chave));

        }
    
    
    
    
    }

}