import java.util.Scanner;

public class Input {
    public static String[] getInput() throws Exception{
        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();
        if (userInput.contains(".") || userInput.contains(",")){
            throw new Exception("Введите целые числа");
        }
        return userInput.split(" ");
    }
    public static String getNumber1(String[] asd){
        return asd[0];
    }
    public static String getNumber2(String[] asd){
        return asd[2];
    }
    public static String getOperator(String[] asd){
        return asd[1];
    }
    public static void checkLength (String [] s) throws Exception{
        if (s.length != 3){
            throw new Exception("Введите два числа и один оператор");
        }
    }
    public static void RomAndArab(String s, String ss) throws Exception{
        if (s.matches(".*[0-10]") && ss.matches("[IVX]")){
            throw new Exception("Введите числа из одной системы счисления");
        }
        if (s.matches("[IVX]") && ss.matches(".*[0-10]"))
            throw new Exception("Введите числа из одной системы счисления");
    }
    public static boolean getChar (char c) throws Exception{
        if (c == '+' || c == '-' || c == '*' || c == '/'){
            return true;
        }else{
            throw new Exception("Введите оператор сложения, вычитания, умножения или деления");
        }
    }
}
