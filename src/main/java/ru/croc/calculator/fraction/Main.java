package ru.croc.calculator.fraction;

import ru.croc.calculator.fraction.util.FractionOperations;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Igor Serikov on 22.05.2016.
 */
public class Main {

    private static boolean isFileOutput = false;
    private static DOM docOutput = null;

    public static void main(String[] args) {
        String delim = "+-*/:";
        Scanner input = null;

        if (args.length == 1)
        {
            try {
                input = new Scanner(new File(args[0]));
                docOutput = new DOM();
                isFileOutput = true;
            }
            catch (Exception e) {
                System.out.println("File not found. Console input.");
            }
        }
        else {
            input = new Scanner(System.in);
            isFileOutput = false;
        }

        while(input.hasNext()){
            String line = input.nextLine();
            parseLine(line, delim);
        }

        try{
            docOutput.writeToFile("test.xml");
        } catch (Exception e) {
            System.out.println("Error with DOM transform");
        }
    }

    private static void parseLine(String line, String delim){
        line = line.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(line, delim, true);

        Fraction a = buildFraction(st);
        if(a==null)
            return;
        String operator =  st.nextToken();
        if(!delim.contains(operator)){
            System.out.println("Error in entered data");
            return;
        }
        Fraction b = buildFraction(st);
        if(a==null)
            return;

        result(a, b, operator);
    }
    private static Fraction buildFraction(StringTokenizer st){
        try {
            String token = st.nextToken();
            int nom = Integer.parseInt(token);

            token = st.nextToken();
            if(!token.equals("/")) {
                System.out.println("Error in entered data");
                return null;
            }

            token = st.nextToken();
            int den = Integer.parseInt(token);
            if(den == 0){
                System.out.println("Error: zero-denominator");
            }

            return new Fraction(nom, den);
        }
        catch(Exception e){
            System.out.println("Error in entered data");
        }
        return null;
    }

    private static void result(Fraction a, Fraction b, String operator){
        String res;
        switch (operator){
            case "+":
                res = FractionOperations.plus(a, b).toString();
                if(isFileOutput==false)
                    System.out.println(res);
                else
                    docOutput.newResultItem("item", res);
                break;
            case "-":
                res = FractionOperations.minus(a, b).toString();
                if(isFileOutput==false)
                    System.out.println(res);
                else
                    docOutput.newResultItem("item", res);
                break;
            case "*":
                res = FractionOperations.multiplication(a, b).toString();
                if(isFileOutput==false)
                    System.out.println(res);
                else
                    docOutput.newResultItem("item", res);
                break;
            case "/":
            case ":":
                res = FractionOperations.division(a, b).toString();
                if(isFileOutput==false)
                    System.out.println(res);
                else
                    docOutput.newResultItem("item", res);
                break;
            default:
                break;
        }
    }
}
