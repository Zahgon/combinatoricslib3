/*
 * Combinatorics Library 3
 * Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator over the all subsets.
 *
 * @param <T> Type of the elements in the subsets.
 * @author Dmytro Paukov
 * @version 3.1.0
 * @see SubSetGenerator
 */
class SimpleSubSetIterator<T> implements Iterator<List<T>> {

    private final SimpleSubSetGenerator<T> generator;

    private final int length;

    private final List<T> currentSubSet;

    private long currentIndex;

    /**
     * Internal bit vector, representing the subset.
     */
    private final BitSet bitVector;

    SimpleSubSetIterator(final SimpleSubSetGenerator<T> generator) {
        this.generator = generator;
        this.length = generator.originalVector.size();
        this.currentSubSet = new ArrayList<>(length);
        this.bitVector = new BitSet(length + 2);
        this.currentIndex = 0;
    }

    /**
     * Returns true if iteration is done, otherwise false.
     *
     * @see Iterator#hasNext()
     */
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the next subset if it is available.
     *
     * @see Iterator#next()
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
