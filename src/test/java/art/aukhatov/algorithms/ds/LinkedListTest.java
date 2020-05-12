package art.aukhatov.algorithms.ds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListTest {

	@Test
	public void walkThrough() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(4);
		linkedList.add(2);
		linkedList.add(8);
		linkedList.add(0);
		linkedList.add(6);

		Iterator<Integer> iterator = linkedList.iterator();

		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(4);
		expectedList.add(2);
		expectedList.add(8);
		expectedList.add(0);
		expectedList.add(6);
		List<Integer> actualList = new ArrayList<>();

		while (iterator.hasNext()) {
			actualList.add(iterator.next());
		}

		assertEquals(expectedList, actualList);
	}

	@Test
	public void shouldReturnReversedStack() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		List<Integer> expectedList = new ArrayList<>();
		expectedList.add(5);
		expectedList.add(4);
		expectedList.add(3);
		expectedList.add(2);
		expectedList.add(1);

		List<Integer> actualList = new ArrayList<>();
		LinkedList<Integer> reverseList = linkedList.reverse();

		for (Integer item : reverseList) {
			actualList.add(item);
		}

		assertEquals(expectedList, actualList);
	}
}