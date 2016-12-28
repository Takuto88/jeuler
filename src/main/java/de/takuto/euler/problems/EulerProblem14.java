package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.util.HashMap;
import java.util.Map;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class EulerProblem14 implements EulerProblem {

    private Map<Long, Integer> cache = new HashMap<Long, Integer>();

    public String solve() {
        int start = 1000000;
        int longestChain = 0;
        int longestChainInt = 0;

        for (int i = 1; i < start; i++) {
            int currChainLengh = getLenghOfCollatzChainFor(i);
            if(currChainLengh > longestChain) {
                longestChainInt = i;
                longestChain = currChainLengh;
            }
        }

        return "The longest collatz chain is " + longestChain + " numbers long. Starting number is: " + longestChainInt;
    }

    public int getNumber() {
        return 14;
    }

    private int getLenghOfCollatzChainFor(int startingInt) {
        long currentNumber = startingInt;
        int chainLength = 1;
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
