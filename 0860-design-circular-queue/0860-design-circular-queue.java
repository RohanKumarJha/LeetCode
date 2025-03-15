class MyCircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false; // Queue is full
        }
        rear = (rear + 1) % capacity; // Move rear pointer circularly
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false; // Queue is empty
        }
        front = (front + 1) % capacity; // Move front pointer circularly
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1; // Return -1 if the queue is empty
        }
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1; // Return -1 if the queue is empty
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */