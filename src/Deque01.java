import java.util.ArrayDeque;

public class Deque01 {
    
    public static void main(String[] args) {
        
        ArrayDeque<String> cards = new ArrayDeque<String>();

        cards.add("ronaldinho");
        cards.add("Hulk");
        cards.add("reinaldo");
        cards.add("Dada");

        for(String card : cards){
            System.out.println("Figurinha " + card);
        }

        cards.clear();

        System.out.println("Figurinhas " + cards);

        System.out.println("Adicionando com Firt e Last");

        cards.addLast("romario");
        cards.add("pele");
        cards.add("Neymar");
        cards.addFirst("Ronaldinho");

        System.out.println(cards);

    }
}
