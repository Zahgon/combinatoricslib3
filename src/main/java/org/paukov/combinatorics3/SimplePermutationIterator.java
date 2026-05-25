/*
 * Combinatorics Library 3
 * Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator for the permutation generator
 *
 * @param <T> Type of elements in the permutations
 * @author Dmytro Paukov
 * @version 3.0
 * @see SimplePermutationGenerator
 */
class SimplePermutationIterator<T> implements Iterator<List<T>> {

    private final SimplePermutationGenerator<T> generator;

    private final List<T> currentPermutation;

    private final int length;

    private long currentIndex;

    private final int[] array1;

    private final int[] array2;

    private final int[] array3;

    private int positionIndex;

    SimplePermutationIterator(SimplePermutationGenerator<T> generator) {
        this.generator = generator;
        this.length = generator.originalVector.size();
        this.currentPermutation = new ArrayList<>(generator.originalVector);
        this.array1 = new int[length + 2];
        this.array2 = new int[length + 2];
        this.array3 = new int[length + 2];
        this.currentIndex = 0;
        for (int i = 1; i <= length; i++) {
            this.array2[i] = i;
            this.array1[i] = i;
            this.array3[i] = -1;
        }
        this.array3[1] = 0;
        this.array1[length + 1] = this.positionIndex = this.length + 1;
        this.array1[0] = this.array1[this.length + 1];
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
