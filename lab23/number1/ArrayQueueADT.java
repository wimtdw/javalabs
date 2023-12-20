package lab23.number1;

public class ArrayQueueADT {
    private static int size;
    private static int head;
    private static Object[] elements = new Object[10];

    // Создать новую очередь
    public static ArrayQueueADT create() {
        return new ArrayQueueADT();
    }

    // Вставить элемент в очередь
    public static void enqueue(Object queue, Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    // Получить первый элемент в очереди
    public static Object element(Object queue) {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // Удалить и вернуть первый элемент в очереди
    public static Object dequeue(Object queue) {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Получить текущий размер очереди
    public static int size(Object queue) {
        return size;
    }

    // Проверить, пуста ли очередь
    public static boolean isEmpty(Object queue) {
        return size == 0;
    }

    // Очистить очередь
    public static void clear(Object queue) {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
    }

    // Увеличить размер массива при необходимости
    private static void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}
