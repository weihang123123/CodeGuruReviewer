/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.company.sample.application;

import java.util.*;

public class Util {
    /**
     * generate a random date in this year
     * @return
     */
    public static Date getRandomDate(){

        GregorianCalendar gc = new GregorianCalendar();

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.getTime();
    }

    /**
     * get a random number between start and end
     * @param start
     * @param end
     * @return
     */
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    /**
     * Judge two dates are in the same day
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDay(Date date1, Date date2) {
        if(date1 == null && date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        //logic to compare the dates and return boolean.
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        return cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
    }
    
    public static int test(int len) {
        int test = 0;
        for(int i=0; i<len; i++) {
            i = i++;
            test += i;
            int k=1;
        }
        return test;
    }

    public static boolean isNull(String str) {

        if (str != null) {
            str = str.trim();
        }

        return (str == null || "".equals(str));
    }

    public static boolean isAlpha(String str) {

        if (str == null) {
            return false;
        }

        int size = str.length();

        if (size == 0)
            return false;

        for (int i = 0; i < size; i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAlphaNumeric(String str) {

        if (str == null) {
            return false;
        }

        int size = str.length();

        if (size == 0)
            return false;

        for (int i = 0; i < size; i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Integer2string.
     *
     * @param integer the integer
     * @return the string
     */
    public static String integer2string(int integer) {
        return ("" + integer);
    }

    /**
     * Long2string.
     *
     * @param longdata the longdata
     * @return the string
     */
    public static String long2string(long longdata) {
        return String.valueOf(longdata);
    }

    /**
     * Float2string.
     *
     * @param floatdata the floatdata
     * @return the string
     */
    public static String float2string(float floatdata) {
        return String.valueOf(floatdata);
    }

    /**
     * Double2string.
     *
     * @param doubledata the doubledata
     * @return the string
     */
    public static String double2string(double doubledata) {
        return String.valueOf(doubledata);
    }

    /**
     * Null2void.
     *
     * @param str the str
     * @return the string
     */
    public static String null2void(String str) {

        if (isNull(str)) {
            str = "";
        }

        return str;
    }

    /**
     * String2integer.
     *
     * @param str the str
     * @return the int
     */
    public static int string2integer(String str) {

        if (isNull(str)) {
            return 0;
        }

        return Integer.parseInt(str);
    }

    /**
     * String2float.
     *
     * @param str the str
     * @return the float
     */
    public static float string2float(String str) {

        if (isNull(str)) {
            return 0.0F;
        }

        return Float.parseFloat(str);
    }

    /**
     * String2double.
     *
     * @param str the str
     * @return the double
     */
    public static double string2double(String str) {

        if (isNull(str)) {
            return 0.0D;
        }

        return Double.parseDouble(str);
    }

    public static String getStr(final String ip) {
        Map<String,String> repo = new HashMap<String,String>();
        if(repo.containsKey(ip)) {
            return repo.get(ip);
        }
        return "";
    }
}

