import java.util.Scanner;

enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seasons season = Seasons.valueOf(scanner.nextLine());

        int temperature = switch (season) {
            case SPRING:
            case AUTUMN:
            yield 20;
            case SUMMER:
            yield 37;
            case WINTER:
            yield 1;
            default: throw new IllegalStateException("Invalid name of Seasons.");
        };

        System.out.println(temperature);
    }
}