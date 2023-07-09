package Stack;

public class QueueExample1 {
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
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        elements = new Object[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (rear == elements.length - 1) {
            resize();
        }
        elements[++rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        T item = (T) elements[front];
        elements[front++] = null;
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
             System.out.println("Queue is empty.");
        }
        return (T) elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, front, newElements, 0, size);
        elements = newElements;
        rear = size - 1;
        front = 0;
    }
}

