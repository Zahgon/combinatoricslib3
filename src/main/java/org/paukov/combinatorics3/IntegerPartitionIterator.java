/*
  Combinatorics Library 3
  Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IntegerPartitionIterator implements Iterator<List<Integer>> {

    private final InternalVector vector1;

    private final InternalVector vector2;

    private List<Integer> currentPartition = null;

    private long currentIndex = 0;

    //it should be 0 to stop the iteration.
    private int stopIndex = 1;

    IntegerPartitionIterator(IntegerPartitionGenerator generator) {
        if (generator.value > 0) {
            vector1 = new InternalVector(generator.value, 0, 0, generator.value);
            vector2 = new InternalVector(generator.value, 0, generator.value + 1, 1);
        } else {
            stopIndex = 0;
            vector1 = new InternalVector(1, 0, 0, 0);
            vector2 = new InternalVector(1, 0, 0, 0);
        }
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<Integer> next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static List<Integer> createPartition(int index, InternalVector vector1, InternalVector vector) {
        List<Integer> partition = new ArrayList<>();
        for (int i = 1; i <= index; i++) {
            for (int j = 0; j < vector1.get(i); j++) {
                partition.add(vector.get(i));
            }
        }
        return partition;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class InternalVector {

        final int[] array;

        InternalVector(int size, int value0, int value1, int value2) {
            array = new int[size + 2];
            array[0] = value0;
            array[1] = value1;
            array[2] = value2;
        }

        int get(int index) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        void set(int index, int value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
