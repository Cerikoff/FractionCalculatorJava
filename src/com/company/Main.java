package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String delim = "+-*/:";
        Scanner input = null;
        if (args.length == 1)
        {
            try {
                input = new Scanner(new File(args[0]));
            }
            catch (Exception e) {
                System.out.println("File not found. Console input.");
            }
        }
        else {
            input = new Scanner(System.in);
        }
        while(input.hasNext()){
            String line = input.nextLine();
            parseLine(line, delim);
        }
    }

    private static void parseLine(String line, String delim){
        line = line.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(line, delim, true);

        try{
            Fraction a = buildFraction(st);
            String operator =  st.nextToken();
            Fraction b = buildFraction(st);

            result(a, b, operator);
        }
        catch (Exception e){

        }
    }
    private static Fraction buildFraction(StringTokenizer st){
        String token = st.nextToken();
        int nom = Integer.parseInt(token);
        token = st.nextToken();
        token = st.nextToken();
        int den = Integer.parseInt(token);
        return new Fraction(nom, den);
    }

    private static void result(Fraction a, Fraction b, String operator){
        switch (operator){
            case "+":
                System.out.println(FractionOperations.plus(a, b));
                break;
            case "-":
                System.out.println(FractionOperations.minus(a, b));
                break;
            case "*":
                System.out.println(FractionOperations.multiplication(a, b));
                break;
            case "/":
            case ":":
                System.out.println(FractionOperations.division(a, b));
                break;
            default:
                break;
        }
    }
}
