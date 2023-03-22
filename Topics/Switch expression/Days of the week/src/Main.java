import java.util.Scanner;

enum DaysOfTheWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(scanner.next());
        int numLetters= switch (day) {
            case MONDAY :
            case FRIDAY :
            case SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case WEDNESDAY :
                yield 9;
            case THURSDAY :

            case SATURDAY:
                yield 8;
            default: throw new IllegalStateException("Invalid day: " + day);

        };


        // Put switch expression here
        System.out.println(numLetters);
    }
}