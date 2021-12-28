

public class Calculator {
    public static void main(String[] args) throws Exception {
        String[] input = Input.getInput();
        Input.checkLength(input);
        String number1 = Input.getNumber1(input);
        String number2 = Input.getNumber2(input);
        String operator = Input.getOperator(input);
        char op = operator.charAt(0);
        Input.getChar(op);
        Input.RomAndArab(number1, number2);
        if (number1.contains("I") || number1.contains("V") || number1.contains("X") || number2.contains("I") || number2.contains("V") || number2.contains("X")){
            int num1 = Converter.romNumToInt(number1);
            int num2 = Converter.romNumToInt(number2);
            if (op == '+') {
                int result = num1 + num2;
                String resultToRom = Converter.intToRomNum(result);
                System.out.println(resultToRom);
            }
            else if (op == '-'){
                int result = num1 - num2;
                Converter.negativeResult(result);
                String resultToRom = Converter.intToRomNum(result);
                System.out.println(resultToRom);
            }
            else if (op == '*'){
                int result = num1 * num2;
                String resultToRom = Converter.intToRomNum(result);
                System.out.println(resultToRom);
            }
            else if (op == '/'){
                int result = num1 / num2;
                Converter.negativeResult(result);
                String resultToRom = Converter.intToRomNum(result);
                System.out.println(resultToRom);
            }
        }
        else if (number1.matches(".*[0-9]") && number2.matches(".*[0-9]")){
            int n1 = Converter.stringToInt(number1);
            int n2 = Converter.stringToInt(number2);

            if (op == '+'){
                System.out.println(n1 + n2);
            }
            else if (op == '-'){
                System.out.println(n1 - n2);
            }
            else if (op == '*'){
                System.out.println(n1 * n2);
            }
            else if (op == '/'){
                System.out.println(n1 / n2);
            }

        }

    }
}
