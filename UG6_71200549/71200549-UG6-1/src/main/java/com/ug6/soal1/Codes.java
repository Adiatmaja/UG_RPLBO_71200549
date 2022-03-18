package com.ug6.soal1;

import java.util.Arrays;
import java.util.ArrayList;

public class Codes {
    public static ArrayList<String> COMPANYCODES;
    public static ArrayList<String> ANDROIDCODES;

    public static String generatePhoneCode(final String companyCode) {
        final int minimum = 1;
        final int maximum = 20;
        final double random = Math.random() * (maximum - minimum + 1) + minimum;
        final int randomCode = (int)random;
        return companyCode + "X" + randomCode;
    }

    public static String generatePhoneCode(final String companyCode, final String androidCode) {
        final int minimum = 1;
        final int maximum = 20;
        final double random = Math.random() * (maximum - minimum + 1) + minimum;
        final int randomCode = (int)random;
        return companyCode + androidCode.charAt(0) + androidCode.charAt(androidCode.length() - 1) + randomCode;
    }

    static {
        Codes.COMPANYCODES = new ArrayList<String>(Arrays.asList("XM", "SG", "AP", "RM", "OP", "VV"));
        Codes.ANDROIDCODES = new ArrayList<String>(Arrays.asList("Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "10 Q", "Red Velvet Cake", "Snow Cone", "Tiramisu"));
    }
}