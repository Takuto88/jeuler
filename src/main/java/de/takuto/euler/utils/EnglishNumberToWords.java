package de.takuto.euler.utils;

import java.text.DecimalFormat;

/**
 * Source from <a href="http://www.rgagnon.com/javadetails/java-0426.html">here</a>
 * Modified by Lennart Rosam to handle "n hundred and something" case
 */
public class EnglishNumberToWords {

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private EnglishNumberToWords() {
    }

    private static String convertLessThanOneThousand(int number) {
        String soFar;

        if (number % 100 < 20) {
            soFar = numNames[number % 100];
            number /= 100;
        } else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0) {
            return soFar;
        }

        if (soFar.equals("")) {
            return numNames[number] + " hundred";
        }

        return numNames[number] + " hundred and" + soFar;
    }


    public static String convert(final long number) {
        // 0 to 999 999 999 999
        if (number == 0) {
            return "zero";
        }

        final String snumber;

        // pad with "0"
        final var mask = "000000000000";
        final var df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        final var billions = Integer.parseInt(snumber.substring(0, 3));
        // nnnXXXnnnnnn
        final var millions = Integer.parseInt(snumber.substring(3, 6));
        // nnnnnnXXXnnn
        final var hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        // nnnnnnnnnXXX
        final var thousands = Integer.parseInt(snumber.substring(9, 12));

        var result = switch (billions) {
            case 0 -> "";
            case 1 -> convertLessThanOneThousand(billions)
                    + " billion ";
            default -> convertLessThanOneThousand(billions)
                    + " billion ";
        };

        final var tradMillions = switch (millions) {
            case 0 -> "";
            case 1 -> convertLessThanOneThousand(millions)
                    + " million ";
            default -> convertLessThanOneThousand(millions)
                    + " million ";
        };
        result = result + tradMillions;

        final var tradHundredThousands = switch (hundredThousands) {
            case 0 -> "";
            case 1 -> "one thousand ";
            default -> convertLessThanOneThousand(hundredThousands)
                    + " thousand ";
        };
        result = result + tradHundredThousands;

        final String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;

        // remove extra spaces!
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }
}