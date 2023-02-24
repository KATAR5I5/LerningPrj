package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        System.out.println(queue);
        int count = 1;
        while (queue.poll() != null) {
            System.out.println(" ".repeat(count++) + queue);
        }
    }

}
