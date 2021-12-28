import java.util.InputMismatchException;

public class Converter {
    public static int romNumToInt(String s) throws Exception{
        if (s.equals("I")){
            return 1;
        }
        else if (s.equals("II")){
            return  2;
        }
        else if (s.equals("III")){
            return  3;
        }
        else if (s.equals("IV")){
            return  4;
        }
        else if (s.equals("V")){
            return  5;
        }
        else if (s.equals("VI")){
            return  6;
        }
        else if (s.equals("VII")){
            return  7;
        }
        else if (s.equals("VIII")){
            return  8;
        }
        else if (s.equals("IX")){
            return  9;
        }
        else if (s.equals("X")){
            return  10;
        }
        else{
            throw new Exception("Введите числа от I до X");
        }
    }
    public static String intToRomNum(int i){
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int t = i / 10;
        int o = i % 10;
        return tens[t] + ones[o];
    }
    public static int stringToInt (String s2) throws Exception{
        int x = Integer.parseInt(s2);
        if (x >= 1 && x <= 10){
            return x;
        }
        else{
            throw new Exception("Введите числа от 1 до 10");
        }
    }
    public static void negativeResult (int n) throws Exception{
        if (n < 1){
            throw new Exception("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
        }
    }

}
