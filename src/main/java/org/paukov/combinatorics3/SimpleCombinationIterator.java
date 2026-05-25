/*
 * Combinatorics Library 3
 * Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator for the simple combination generator.
 *
 * @param <T> Type of the elements in the combinations.
 * @author Dmytro Paukov
 * @version 3.0
 * @see SimpleCombinationGenerator
 */
class SimpleCombinationIterator<T> implements Iterator<List<T>> {

    private final SimpleCombinationGenerator<T> generator;

    private final List<T> currentCombination = new ArrayList<>();

    // Internal array
    private final int[] bitVector;

    private long currentIndex;

    //Criteria to stop iterating the combinations.
    private int endIndex = 0;

    SimpleCombinationIterator(SimpleCombinationGenerator<T> generator) {
        this.generator = generator;
        this.bitVector = new int[generator.combinationLength + 1];
        for (int i = 0; i <= generator.combinationLength; i++) {
            this.bitVector[i] = i;
        }
        if (generator.originalVector.size() > 0) {
            this.endIndex = 1;
        }
        this.currentIndex = 0;
    }

    private void setValue(int index, T value) {
        if (index < this.currentCombination.size()) {
            this.currentCombination.set(index, value);
        } else {
            this.currentCombination.add(index, value);
        }
    }

    /**
     * Returns true if all combinations were iterated, otherwise false
     */
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Moves to the next combination
     */
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
