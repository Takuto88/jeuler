package de.takuto.euler.problems;


import de.takuto.euler.EulerProblem;
import de.takuto.euler.utils.EnglishNumberToWords;

public class EulerProblem17 implements EulerProblem {

    private static final int END_NUMBER = 1000;

    public String solve() {
        String sum = "";

        for (int num = 1; num <= END_NUMBER; num++) {
            sum += EnglishNumberToWords.convert((long) num);
        }

        sum = sum.trim().replaceAll("[\\s|\\-]", "");

        return "The numbers 1 through " + END_NUMBER + " written out are using " + sum.length() + " letters";
    }

    public int getNumber() {
        return 17;
    }
}
