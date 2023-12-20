package lab23.number1;

public class Main {
    public static void main(String[] args) {
        // Пример использования ArrayQueueModule
        System.out.println("ArrayQueueModule Example:");
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("Size: " + ArrayQueueModule.size());
        while (!ArrayQueueModule.isEmpty()) {
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
        }
        System.out.println();

        // Пример использования ArrayQueueADT
        System.out.println("ArrayQueueADT Example:");
        ArrayQueueADT queue = ArrayQueueADT.create();
        ArrayQueueADT.enqueue(queue, "Hello");
        ArrayQueueADT.enqueue(queue, "World");
        System.out.println("Element: " + ArrayQueueADT.element(queue));
        System.out.println("Size: " + ArrayQueueADT.size(queue));
        while (!ArrayQueueADT.isEmpty(queue)) {
            System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
        }
        System.out.println();

        // Пример использования ArrayQueue
        System.out.println("ArrayQueue Example:");
        ArrayQueue<Integer> intQueue = new ArrayQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        System.out.println("Element: " + intQueue.element());
        System.out.println("Size: " + intQueue.size());
        while (!intQueue.isEmpty()) {
            System.out.println("Dequeue: " + intQueue.dequeue());
        }
    }
}
