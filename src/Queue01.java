import java.util.PriorityQueue;

public class Queue01 {
    
    public static void main(String[] args) {


        PriorityQueue<Integer> queue = new  PriorityQueue<Integer>();

        queue.add(01);
        queue.add(02);
        queue.add(03);
        queue.add(04);
        queue.add(05);
        queue.add(06);
       
        System.out.println("primeiro elemento da fila");
        System.out.println(queue.peek());

        System.out.println("imprimindo a fila");
        System.out.println(queue);
    }
        
    
}
