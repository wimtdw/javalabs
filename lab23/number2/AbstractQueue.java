package lab23.number2;

import lab23.number2.Queue;

abstract class AbstractQueue<T> implements Queue<T> {
    protected int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
