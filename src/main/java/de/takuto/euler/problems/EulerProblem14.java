package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.util.HashMap;
import java.util.Map;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 *  n → n/2 (n is even)
 *  n → 3n + 1 (n is odd)
 * </p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 *  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * </p>
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class EulerProblem14 implements EulerProblem {

    private final Map<Long, Integer> cache = new HashMap<>();

    public String solve() {
        final var start = 1000000;
        var longestChain = 0;
        var longestChainInt = 0;

        for (var i = 1; i < start; i++) {
            final var currentChainLength = getLengthOfCollatzChainFor(i);
            if(currentChainLength > longestChain) {
                longestChainInt = i;
                longestChain = currentChainLength;
            }
        }

        return "The longest collatz chain is " + longestChain + " numbers long. Starting number is: " + longestChainInt;
    }

    public int getNumber() {
        return 14;
    }

    private int getLengthOfCollatzChainFor(final int startingInt) {
        long currentNumber = startingInt;
        var chainLength = 1;
        while (currentNumber != 1) {
            if(cache.containsKey(currentNumber)) {
                chainLength = chainLength + cache.get(currentNumber);
                break;
            }

            if (currentNumber % 2 == 0) {
                currentNumber = currentNumber / 2;
            } else {
                currentNumber = (3 * currentNumber) + 1;
            }
            chainLength++;
        }

        cache.put((long) startingInt, chainLength);

        return chainLength;
    }

}
