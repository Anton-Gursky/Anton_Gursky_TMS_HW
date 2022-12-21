package Task_16;

import java.util.*;

public class Calculator {

    public String mathExpression;
    public String[] temp;
    public List<String> variables= new ArrayList<>();
    public int result = 0;
    public LinkedHashMap <String, Integer> romanDigits;
    public String string;
    public int matches;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate(){

        if (mathExpression.contains("+")){

            temp = mathExpression.split("\\+");
            variables.addAll(Arrays.asList(temp));

                for (int i = 0; i < variables.size(); i++) {
                    result += Integer.parseInt(variables.get(i));
                }
            }
        else if (mathExpression.contains("-")) {

            temp = mathExpression.split("-");
            variables.addAll(Arrays.asList(temp));
            result = Integer.parseInt(variables.get(0));

            for (int i = 1; i < variables.size(); i++) {
                result -= Integer.parseInt(variables.get(i));
            }

        } else if (mathExpression.contains("*")) {

            temp = mathExpression.split("\\*");
            variables.addAll(Arrays.asList(temp));
            result = Integer.parseInt(variables.get(0));

            for (int i = 1; i < variables.size(); i++) {
                result *= Integer.parseInt(variables.get(i));
            }

        } else if (mathExpression.contains("/")) {

            temp = mathExpression.split("/");
            variables.addAll(Arrays.asList(temp));
            result = Integer.parseInt(variables.get(0));

            for (int i = 1; i < variables.size(); i++) {
                result /= Integer.parseInt(variables.get(i));
            }

        } else {
            System.out.println("Не введен знак (+, -, *, /)");
        }

        System.out.println(" = " + result);
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
}