/*
  Combinatorics Library 3
  Copyright 2009-2016 Dmytro Paukov d.paukov@gmail.com
 */
package org.paukov.combinatorics3;

import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.List;

/**
 * The main class that contains the methods to create specific supported generators.
 */
public class Generator {

    /**
     * Creates a combination generator for a given set of arguments.
     * @param args A list of arguments (elements) for the generator.
     * @param <T> A type of the arguments.
     * @return An instance of the CombinationGenerator with the provided elements.
     */
    @SafeVarargs
    public static <T> CombinationGenerator<T> combination(T... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a combination generator for a given set of arguments.
     * @param collection A collection of the elements for the generator.
     * @param <T> A type of the elements.
     * @return An instance of the CombinationGenerator with the provided elements.
     */
    public static <T> CombinationGenerator<T> combination(Collection<T> collection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a permutation generator for a given set of arguments.
     * @param args A list of arguments (elements) for the generator.
     * @param <T> A type of the arguments.
     * @return An instance of the PermutationGenerator with the provided elements.
     */
    @SafeVarargs
    public static <T> PermutationGenerator<T> permutation(T... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a permutation generator for a given collection of the elements.
     * @param collection A collection of the elements for the generator.
     * @param <T> A type of the elements.
     * @return An instance of the PermutationGenerator with the provided elements.
     */
    public static <T> PermutationGenerator<T> permutation(Collection<T> collection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a subset generator for a given collection of the elements.
     * @param collection A collection of the elements for the generator.
     * @param <T> A type of the elements.
     * @return An instance of the generator that produces subsets of the elements.
     */
    public static <T> SubSetGenerator<T> subset(Collection<T> collection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a subset generator for a given list of the arguments.
     * @param args A list of the arguments for the generator.
     * @param <T> A type of the elements.
     * @return An instance of the generator that produces subsets of the elements.
     */
    @SafeVarargs
    public static <T> SubSetGenerator<T> subset(T... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IGenerator<List<Integer>> partition(Integer value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SafeVarargs
    public static <T> IGenerator<List<T>> cartesianProduct(List<T>... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> IGenerator<List<T>> cartesianProduct(Collection<List<T>> collection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
