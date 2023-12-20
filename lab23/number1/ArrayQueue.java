package lab23.number1;

public class ArrayQueue<T> {
    private int size;
    private int head;
    private Object[] elements = new Object[10];

    // Вставить элемент в очередь
    public void enqueue(T element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    // Получить первый элемент в очереди
    public T element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[head];
    }

    // Удалить и вернуть первый элемент в очереди
    public T dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = (T) elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Получить текущий размер очереди
    public int size() {
        return size;
    }

    // Проверить, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
    }

    // Увеличить размер массива при необходимости
    private void ensureCapacity(int minCapacity) {
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
