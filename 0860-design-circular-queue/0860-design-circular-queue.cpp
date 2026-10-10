class MyCircularQueue {
    // defining a queue
private:
    int* queue;     // array for  circular queue implementation
    int front = -1; // intially front = -1
    int rear = -1;  // intailly rear = -1
    int capacity;   // capacity of queue

public:
    // class constructor
    MyCircularQueue(int k) {
        queue = new int[k](); // defining circular queue of size k
        capacity = k;         // intailizing capacity
    }

    //  enQueue operation
    bool enQueue(int value) {

        // condition for overflow
        if (front == rear + 1 || (front == 0 && rear == capacity - 1)) {
            return false;
        }
        // intially when queue is empty
        if (rear == -1) {
            queue[0] = value;
            front = rear = 0;
        }
        // when queue is not empty and not full
        else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
        }
        return true;
    }

    // deque operation
    bool deQueue() {

        // underFlow condition
        if (front == -1) {
            return false;
        }
        //  when queue contains only one element
        if (front == rear) {
            front = rear = -1;
        }
        //  when queue contains more than one element
        else {
            front = (front + 1) % capacity;
        }
        return true;
    }
    
    //  element at front of queue
    int Front() {
        // underflow condition
        if (front == -1) {
            return -1;
        }
        // return element at front of queue
        return queue[front];
    }

    //  element at rear  of queue
    int Rear() {
        if (rear == -1) { // underflow condition
            return -1;
        }
        return queue[rear]; // return element at rear opf queue
    }

    bool isEmpty() {
        return front == -1; // when queue is empty
    }

    bool isFull() {
        return front == rear + 1 ||
               (front == 0 && rear == capacity- 1); // when queue is full
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */