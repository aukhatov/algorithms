package art.aukhatov.algorithms.problems;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class SimpleSpotStoreTest {

    @Test
    public void shouldReturnUsdRubSpots() {
        SimpleSpotStore store = new SimpleSpotStore();
        LocalDateTime tickTime = LocalDateTime.of(2020, 10, 1, 12, 15, 0, 0);
        double expectedSpotValue = 76.45;
        store.add("USDRUB", expectedSpotValue, tickTime);
        store.add("USDRUB", 70, LocalDateTime.of(2020, 10, 2, 12, 15, 0, 0));
        store.add("USDRUB", 56, LocalDateTime.of(2020, 10, 5, 12, 15, 0, 0));


        assertEquals(expectedSpotValue, store.get("USDRUB", tickTime), 0.0);
    }
}