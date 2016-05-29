package de.takuto.euler;

/**
 * Created by lennart on 29.05.16.
 */
public class EulerProblem1 implements EulerProblem {

    public String solve() {
        int min = 0;
        int max = 999;
        int sum = 0;

        for(int i = min; i <= max; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

}
