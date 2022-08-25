package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 * <p>
 *     <ul>
 *      <li>1 Jan 1900 was a Monday.</li>
 *      <li>Thirty days has September,</li>
 *      <li>April, June and November.</li>
 *      <li>All the rest have thirty-one,</li>
 *      <li>Saving February alone,</li>
 *      <li>Which has twenty-eight, rain or shine.</li>
 *      <li>And on leap years, twenty-nine.</li>
 *      <li>A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.</li>
 *     </ul>
 * </p>
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class EulerProblem19 implements EulerProblem {

    private final static int YEAR_START = 1901;
    private final static int YEAR_END = 2000;

    @Override
    public String solve() {
        // screw those stupid assumptions - that's what the calendar API is for :P
        final var calendar = new GregorianCalendar();

        var numberOfSundays = 0;
        for (var currentYear = YEAR_START; currentYear <= YEAR_END; currentYear++) {
            for(var currentMonth = Calendar.JANUARY; currentMonth <= Calendar.DECEMBER; currentMonth++) {
                calendar.set(currentYear, currentMonth, 1);
                if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                    continue;
                }
                numberOfSundays++;
            }
        }

        return String.format(
                "The total number of sundays on the first of the month between %d and %d is %d",
                YEAR_START,
                YEAR_END,
                numberOfSundays
        );
    }

    @Override
    public int getNumber() {
        return 19;
    }
}
