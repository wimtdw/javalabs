package lab23.number1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArrayQueueADTTest {
    private ArrayQueueADT queue;

    @Before
    public void setUp() {
        queue = ArrayQueueADT.create();
    }

    @Test
    public void testEnqueueAndDequeue() {
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue, 2);
        assertEquals(1, ArrayQueueADT.dequeue(queue));
    }

    @Test
    public void testElement() {
        ArrayQueueADT.enqueue(queue, 1);
        assertEquals(1, ArrayQueueADT.element(queue));
    }

    @Test
    public void testSize() {
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue, 2);
        assertEquals(2, ArrayQueueADT.size(queue));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayQueueADT.isEmpty(queue));
        ArrayQueueADT.enqueue(queue, 1);
        assertFalse(ArrayQueueADT.isEmpty(queue));
    }

    @Test
    public void testClear() {
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue, 2);
        ArrayQueueADT.clear(queue);
        assertTrue(ArrayQueueADT.isEmpty(queue));
    }
}
