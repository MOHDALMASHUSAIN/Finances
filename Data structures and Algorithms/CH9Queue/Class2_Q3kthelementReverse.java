package CH9Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Class2_Q3kthelementReverse {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        int k = 3;

        Queue<Integer> tempQueue1 = new LinkedList<>();
        Queue<Integer> tempQueue2 = new LinkedList<>();

        // Move the first k elements to tempQueue1
        for (int i = 0; i < k; i++) {
            tempQueue1.offer(queue.poll());
        }

        // Reverse the first k elements in tempQueue1
        while (!tempQueue1.isEmpty()) {
            tempQueue2.offer(tempQueue1.poll());
        }

        // Add the reversed elements back to the original queue
        while (!tempQueue2.isEmpty()) {
            queue.offer(tempQueue2.poll());
        }

        // Add the remaining elements back to the queue
        while (!tempQueue1.isEmpty()) {
            queue.offer(tempQueue1.poll());
        }

        System.out.println(queue);
    }
}
