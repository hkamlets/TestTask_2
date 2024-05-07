import java.util.Scanner;

    class Main {
        Main() {
        }

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            String inputWithSpase = sc.nextLine();
            String input = inputWithSpase.replaceAll("\\s", "");
            System.out.println(calc(input));
        }

        public static String calc(String input) throws Exception {
            String[] operation = input.split("[+\\-*/]");
            if (operation.length != 2) {
                throw new Exception("throws Exception");
            } else {
                String operator = findoperator(input);
                if (operator == null) {
                    throw new Exception("throws Exception");
                } else {
                    int a = Integer.parseInt(operation[0]);
                    int b = Integer.parseInt(operation[1]);
                    if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                        int intRezult = calculation(a, b, operator);
                        String rezult = String.valueOf(intRezult);
                        return rezult;
                    } else {
                        throw new Exception("throws Exception");
                    }
                }
            }
        }

        static String findoperator(String input) {
            if (input.contains("+")) {
                return "+";
            } else if (input.contains("-")) {
                return "-";
            } else if (input.contains("/")) {
                return "/";
            } else {
                return input.contains("*") ? "*" : null;
            }
        }

        static int calculation(int a, int b, String operator) {
            int var10000;
            switch (operator) {
                case "+" -> var10000 = a + b;
                case "-" -> var10000 = a - b;
                case "/" -> var10000 = a / b;
                default -> var10000 = a * b;
            }

            return var10000;
        }
    }