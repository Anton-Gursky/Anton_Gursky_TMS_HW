package Task_16;

import java.util.*;

public class Calculator {

    public String mathExpression;
    public String[] temp;
    public List<Integer> variables= new ArrayList<>();
    public int result = 0;
    public LinkedHashMap <String, Integer> romanDigits;
    public String string;
    public int matches;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate(){

        if (mathExpression.contains(" + ")){

            temp = mathExpression.split(" \\+ ");
            addToArrayList();

            for (int i = 0; i < variables.size(); i++) {
                    result += variables.get(i);
            }
        }
        else if (mathExpression.contains("-")) {

            temp = mathExpression.split(" - ");
            addToArrayList();
            result = variables.get(0);

            for (int i = 1; i < variables.size(); i++) {
                result -= variables.get(i);
            }

        } else if (mathExpression.contains("*")) {

            temp = mathExpression.split(" \\* ");
            addToArrayList();
            result = variables.get(0);

            for (int i = 1; i < variables.size(); i++) {
                result *= variables.get(i);
            }

        } else if (mathExpression.contains("/")) {

            temp = mathExpression.split(" / ");
            addToArrayList();
            result = variables.get(0);

            for (int i = 1; i < variables.size(); i++) {
                result /= variables.get(i);
            }

        }
        else {
            System.out.println("Не введен знак (+, -, *, /)");
        }

        System.out.println(" = " + result);
        System.out.println("Число Фибоначчи, стоящее в последовательности на месте " + result + " = " + nthFibonacciDigit(result));
        return result;
    }

    public void toRomanDigits(int digit){

        romanDigits = new LinkedHashMap<>();

        romanDigits.put("M", 1000);
        romanDigits.put("CM", 900);
        romanDigits.put("D", 500);
        romanDigits.put("CD", 400);
        romanDigits.put("C", 100);
        romanDigits.put("XC", 90);
        romanDigits.put("L", 50);
        romanDigits.put("XL", 40);
        romanDigits.put("X", 10);
        romanDigits.put("IX", 9);
        romanDigits.put("V", 5);
        romanDigits.put("IV", 4);
        romanDigits.put("I", 1);

        string = "";

        for (Map.Entry <String, Integer> entry : romanDigits.entrySet()){
            matches = digit / entry.getValue();
            string += repeat(entry.getKey(), matches);
            digit = digit % entry.getValue();
        }

        System.out.println(string);
    }

    public String repeat (String str, int n){

        if(str == null) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public int toArabic(String input){

        String romanNumeral = input.toUpperCase();
        int secondResult = 0;
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {

            RomanNumeral symbol = romanNumerals.get(i);

            if (romanNumeral.startsWith(symbol.name())) {

                secondResult += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());

            } else {

                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return secondResult;
    }

    public void addToArrayList(){

        for (int i = 0; i < temp.length; i++) {

            if(temp[i].matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")){
                variables.add(toArabic(temp[i]));
            }
            else {
                variables.add(Integer.parseInt(temp[i]));
            }
        }
    }

    public int nthFibonacciDigit(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int n0 = 0;
        int n1 = 1;
        int tempNthTerm;

        for (int i = 2; i < n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        return n1;
    }
}