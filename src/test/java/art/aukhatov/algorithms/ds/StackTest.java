package art.aukhatov.algorithms.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

	@Test
	public void pushPop() {
		Stack<String> stack = new Stack<>();
		stack.push("3");
		stack.push("2");
		stack.push("1");

		assertEquals("1", stack.peek());
		assertEquals(3, stack.size());

		assertEquals("1", stack.pop());
		assertEquals(2, stack.size());

		assertEquals("2", stack.pop());
		assertEquals(1, stack.size());

		assertEquals("3", stack.pop());
		assertEquals(0, stack.size());
	}
}