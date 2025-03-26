class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int X) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1); 
        }
        System.out.println("Inserting " + X);
        arr[++top] = X;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);  
        }
        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements are: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.print("Stack:");
        stack.printStack();

	stack.pop();
        System.out.println("\nAfter popping out: ");
        stack.printStack();

         
    }
}
