package art.aukhatov.algorithms.problems;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleSpotStore implements SpotStore {

    private final Map<String, NavigableMap<LocalDateTime, Double>> storage = new ConcurrentHashMap<>();

    @Override
    public void add(String ccypair, double spot, LocalDateTime tickTime) {
        storage.computeIfAbsent(ccypair, f -> new TreeMap<>(LocalDateTime::compareTo));
        NavigableMap<LocalDateTime, Double> spotStore = storage.get(ccypair);
        spotStore.put(tickTime, Double.valueOf(spot));
    }

    @Override
    public double get(String ccypair, LocalDateTime dateTime) {
        NavigableMap<LocalDateTime, Double> spotStore = storage.get(ccypair);
        if (Objects.nonNull(spotStore)) {
            Map.Entry<LocalDateTime, Double> entry = spotStore.floorEntry(dateTime);
            if (Objects.nonNull(entry)) {
                return entry.getValue();
            } else {
                throw new NoSuchElementException("Spot value not found");
            }
        }
        throw new NoSuchElementException("Spot value not found");
    }

    @Override
    public void init(int days) {

    }
}
