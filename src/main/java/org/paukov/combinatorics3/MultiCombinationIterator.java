/*
  Combinatorics Library 3
  Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Multi-combinations iterator for enumerating combinations with repetitions.
 *
 * @param <T> Type of the elements in the combinations.
 * @author Dmytro Paukov
 * @version 3.0
 * @see MultiCombinationGenerator
 */
class MultiCombinationIterator<T> implements Iterator<List<T>> {

    private final MultiCombinationGenerator<T> generator;

    private final List<T> currentCombination = new ArrayList<>();

    private final int[] bitVector;

    private long currentIndex;

    // Criteria to stop iterating
    private boolean isEnd;

    MultiCombinationIterator(MultiCombinationGenerator<T> generator) {
        this.generator = generator;
        this.bitVector = new int[generator.combinationLength];
        for (int i = 0; i < generator.combinationLength; i++) {
            bitVector[i] = 0;
        }
        this.isEnd = false;
        this.currentIndex = 0;
    }

    private void setValue(int index, T value) {
        if (index < this.currentCombination.size()) {
            this.currentCombination.set(index, value);
        } else {
            this.currentCombination.add(index, value);
        }
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<T> next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
