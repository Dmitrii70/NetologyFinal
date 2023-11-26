package Patterns.Lesson3;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();

    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        if (max < min) {
            throw new RuntimeException("Max value should be more than the min value");
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max + 1);
            }
        };
    }
}
