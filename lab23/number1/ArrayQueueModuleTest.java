package lab23.number1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArrayQueueModuleTest {

    @Before
    public void setUp() {
        ArrayQueueModule.clear();
    }

    @Test
    public void testEnqueueAndDequeue() {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        assertEquals(1, ArrayQueueModule.dequeue());
        assertEquals(2, ArrayQueueModule.dequeue());
    }

    @Test
    public void testElement() {
        ArrayQueueModule.enqueue(1);
        assertEquals(1, ArrayQueueModule.element());
    }

    @Test
    public void testSize() {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        assertEquals(2, ArrayQueueModule.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(1);
        assertFalse(ArrayQueueModule.isEmpty());
    }

    @Test
    public void testClear() {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.clear();
        assertTrue(ArrayQueueModule.isEmpty());
    }
}
