import java.util.LinkedList;

public class LinkedListo1 {

    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<String>();

        names.add("cassiano");
        names.add("joao");
        names.add("cassi");
        names.add("rica");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
                
            System.out.println(names.get(i));
        }

        names.remove(0);
        names.remove("joao");

        System.out.println("Itens removidos" + names);
    }

    
}
