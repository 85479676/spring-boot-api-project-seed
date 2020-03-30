package com.company.project.util;

import java.text.DecimalFormat;

public class Format {
    private static final DecimalFormat AMOUNT_FORMAT = new DecimalFormat("0.00");

    private static final DecimalFormat AMOUNT_FORMAT_0 = new DecimalFormat("0.0");


    public static double formatAmount(double in) {
        return Double.parseDouble(AMOUNT_FORMAT.format(in));
    }


    public static double formatAmountOne(double in) {
        return Double.parseDouble(AMOUNT_FORMAT_0.format(in));
    }
}
