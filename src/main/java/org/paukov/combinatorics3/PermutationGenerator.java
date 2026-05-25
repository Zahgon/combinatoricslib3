/*
 * Combinatorics Library 3
 * Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.paukov.combinatorics3.EmptyGenerator.emptyGenerator;

/**
 * A generator for iterating over the permutations.
 * @param <T> Type of the elements in the permutations.
 */
public class PermutationGenerator<T> {

    final Collection<T> originalVector;

    PermutationGenerator(Collection<T> originalVector) {
        this.originalVector = originalVector;
    }

    public static <T> boolean hasDuplicates(Collection<T> collection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IGenerator<List<T>> simple() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IGenerator<List<T>> simple(TreatDuplicatesAs treatAsIdentical) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IGenerator<List<T>> k(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IGenerator<List<T>> k(int length, TreatDuplicatesAs treatAsIdentical) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IGenerator<List<T>> withRepetitions(int permutationLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum TreatDuplicatesAs {

        DIFFERENT, IDENTICAL
    }
}
