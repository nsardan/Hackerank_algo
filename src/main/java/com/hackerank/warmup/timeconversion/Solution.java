package com.hackerank.warmup.timeconversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /* 07:05:45PM
         * 19:05:45
         * Write your code here.
         */
    	DateFormat readFormat = new SimpleDateFormat("hh:mm:ssaa");
    	DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
    	Date date = null;
    	try {
    		date = readFormat.parse(s);
    	}catch(ParseException p) {
    		p.printStackTrace();
    	}
    	
    	return writeFormat.format(date);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        //bw.write(result);
        //bw.newLine();

        //bw.close();
    }
}