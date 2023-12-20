package lab23.number1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArrayQueueTest {
    private ArrayQueue<Integer> queue;

    @Before
    public void setUp() {
        queue = new ArrayQueue<>();
    }

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
    }

    @Test
    public void testElement() {
        queue.enqueue(1);
        assertEquals(Integer.valueOf(1), queue.element());
    }

    @Test
    public void testSize() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testClear() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.clear();
        assertTrue(queue.isEmpty());
    }
}
