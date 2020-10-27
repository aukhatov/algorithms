package art.aukhatov.algorithms.problems;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleSpotStore implements SpotStore {

    private final Map<String, Map<LocalDateTime, Double>> storage = new ConcurrentHashMap<>();

    @Override
    public void add(String ccypair, double spot, LocalDateTime tickTime) {
        storage.computeIfAbsent(ccypair, f -> new ConcurrentHashMap<>());
        Map<LocalDateTime, Double> spotStore = storage.get(ccypair);
        spotStore.put(tickTime, Double.valueOf(spot));
    }

    @Override
    public double get(String ccypair, LocalDateTime dateTime) {
        Map<LocalDateTime, Double> spotStore = storage.get(ccypair);
        if (Objects.nonNull(spotStore)) {
            // there has to implement Binary Tree to get latest tick time spot value
            return spotStore.get(dateTime);
        }
        throw new NoSuchElementException("Spot value not found");
    }

    @Override
    public void init(int days) {

    }
}
