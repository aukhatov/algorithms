package art.aukhatov.algorithms.problems;

import java.time.LocalDateTime;

/**
 * Here is interface you need to implement.
 * Please use only single .java file for solution. Please make sure it can be compiled on Java 11 without
 * any additional steps and 3rd-party libs. Please use comments to describe your solution.
 * <p>
 * This is spot provider, it stores information about ticking spots, and provide ability to requests like : what was the spot
 * at any given point in time.
 * CCYPAIR  is combination of two 3chars currencies like "EURUSD" or "JPYRUB" and so on.  Always in uppercase.
 * SPOT is ticking value of given ccypair  like for "USDRUB" it can be 76.45 then 76.46 then 76.44 ...
 * <p>
 * We can assume that all data fits in memory, so we don't need to store it anywhere.
 * But there is a  "SUPER" task to have some persisting logic. It is not mandatory task. So, up to you.
 *
 * @ThreadSafe Please note that implementation should be thread safe. This methods are calling from a lot of threads.
 * <p>
 * Please don't spend more then one hour on this task.
 * And one more hour on "SUPER" task, if you are ready to spend this time on it.(not mandatory)
 */

public interface SpotStore {
    /**
     * We are connected to other system that feed us ticks from different markets.
     * When we receive new tick we call add() method to store it. So later we can use this information in get method.
     * Note that time is increasing at each tick for given ccypair.
     * <p>
     * Time complexity:  add() should work faster than O(logN)
     *
     * @param ccypair  always 6 chars uppercase, only valid CCY codes. maximum number of different strings is 100X100
     * @param spot     just a double value for spot that changed at this tickTime
     * @param tickTime time when this spot ticks.
     */
    void add(String ccypair, double spot, LocalDateTime tickTime);

    /**
     * This is the place where we try to understand what was the spot at some point in time.
     * Like  what was the spot at 5pm Moscow for "EURRUB".  Note that there can be no spot at exact given time,
     * so you need to return latest at this time.
     *
     * @param ccypair  always 6 chars uppercase, only valid CCY codes. maximum number of different strings is 100X100
     * @param dateTime point in time.
     * @return spot value at this given time
     */
    double get(String ccypair, LocalDateTime dateTime);

    /**
     * "SUPER" task.  It is not mandatory task. So, up to you.
     * This method is called at the start of JVM  to init data with history from
     * persisting storage(up to you do decide how to store and read it)
     *
     * @param days number of days back we want to load from history
     */
    void init(int days);
}