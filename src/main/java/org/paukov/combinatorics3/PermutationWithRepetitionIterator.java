/*
 * Combinatorics Library 3
 * Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PermutationWithRepetitionIterator<T> implements Iterator<List<T>> {

    final PermutationWithRepetitionGenerator<T> generator;

    private final List<T> currentPermutation;

    private final int[] bitVector;

    private long currentIndex;

    PermutationWithRepetitionIterator(PermutationWithRepetitionGenerator<T> generator) {
        this.generator = generator;
        List<T> list = new ArrayList<>(this.generator.permutationLength);
        T defaultValue = generator.originalVector.get(0);
        for (int i = 0; i < this.generator.permutationLength; i++) {
            list.add(defaultValue);
        }
        this.currentPermutation = new ArrayList<>(list);
        this.bitVector = new int[this.generator.permutationLength + 2];
        this.currentIndex = 0;
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
