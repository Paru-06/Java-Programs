public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    // Constructor to initialize the front and rear pointers
    Queue() {
        front = -1;
        rear = -1;
    }

    // Method to check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    // Method to add an element to the queue
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Method to remove an element from the queue
    int deQueue() {
        int element;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " deleted");
            return element;
        }
    }

    // Method to display the elements in the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index -> " + rear);
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue q = new Queue();

        // Testing deQueue on empty queue
        q.deQueue();

        // Inserting elements into the queue
        for (int i = 1; i <= 5; i++) {
            q.enQueue(i);
        }

        // Trying to insert another element into the full queue
        q.enQueue(6);

        // Displaying the queue
        q.display();

        // Removing one element from the queue
        q.deQueue();

        // Displaying the queue again
        q.display();
    }
}
