package Stack;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Orange");

        // Dequeue elements
        System.out.println(queue.dequeue()); // Apple
        System.out.println(queue.dequeue()); // Banana

        // Peek at the front element
        System.out.println(queue.peek()); // Orange

        // Check if the queue is empty
        System.out.println(queue.isEmpty()); // false

        // Get the size of the queue
        System.out.println(queue.size()); // 1
    }
}

class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.pollFirst();
    }

    public T peek() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}


