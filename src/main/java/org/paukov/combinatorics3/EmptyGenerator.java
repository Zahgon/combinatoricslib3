package org.paukov.combinatorics3;

import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Always empty stub generator.
 */
class EmptyGenerator<T> implements IGenerator<T> {

    private static final EmptyGenerator<?> EMPTY = new EmptyGenerator<>();

    private EmptyGenerator() {
    }

    static <T> EmptyGenerator<T> emptyGenerator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Stream<T> stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
