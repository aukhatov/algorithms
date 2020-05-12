package art.aukhatov.algorithms.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

	@Test
	public void addAndTakeElements() {
		Queue<String> queue = new Queue<>();
		queue.add("Artur");
		queue.add("Sher");
		queue.add("Nikita");
		queue.add("Alex");

		assertTrue(queue.notEmpty());

		assertEquals("Artur", queue.peek());

		assertEquals("Artur", queue.take());
		assertEquals("Sher", queue.take());
		assertEquals("Nikita", queue.take());
		assertEquals("Alex", queue.take());

		assertTrue(queue.isEmpty());
	}
}