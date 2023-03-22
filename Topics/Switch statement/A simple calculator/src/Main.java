import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String b = scanner.next();
        long c = scanner.nextLong();
        switch (b) {
            case "+" -> System.out.println(a + c);
            case "-" -> System.out.println(a - c);
            case "*" -> System.out.println(a * c);
            case "/" -> {
                if (c!= 0) {
                    System.out.println(a / c);
                }else {
                    System.out.println("Division by 0!");
                }

            }
            default -> System.out.println("Unknown operator");
        }
        }
    }
