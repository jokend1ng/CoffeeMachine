package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water=400;
    public static int milk=540;
    public static int coffee_beans=120;
    public static int cups=9;
    public static int money=550;
    public static boolean isRunning=true;
    public static String text = """
            The coffee machine has:
            %d ml of water
            %d ml of milk
            %d g of coffee beans
            %d disposable cups
            $%d of money
            """;
    public static boolean isTrue = true;
    public static String testIngredients(int a,int b,int c){
        if (water>=a && milk>=b && coffee_beans>=c&&cups>=1) {
            System.out.println("I have enough resources, making you a coffee!");
            isRunning=true;
            return "I have enough resources, making you a coffee!";
        }else if(water<a && milk>=b && coffee_beans>=c && cups>1) {
            System.out.println("Sorry, not enough water!");
           isRunning=false;
        }if(water>=a && milk<b && coffee_beans>=c && cups>1) {
            isRunning=false;
            System.out.println("Sorry, not enough milk!");
        }if(water>=a && milk>=b && coffee_beans<c && cups>1) {
            isRunning=false;
            System.out.println("Sorry, not enough coffee beans!");
        }if(water>=a && milk>=b && coffee_beans>=c && cups<1){
            isRunning=false;
            System.out.println("Sorry, not enough disposable cups!");
        }else{

            return "Sorry, not enough resources!";
        }
        return null;

    }
    public static void buy(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        System.out.print(">");
        String choice=sc.next();
        switch(choice){
            case "1":
               testIngredients(250,0,16);
               if (isRunning) {                water-=250;
                coffee_beans-=16;
                cups-=1;
                money+=4;}
                break;

            case "2":
                testIngredients(350,75,20);
                if (isRunning) {
                water-=350;
                milk-=75;
                coffee_beans-=20;
                cups-=1;
                money+=7;}
                break;

            case "3":
                testIngredients(200,100,12);
                if (isRunning) {
                water-=200;
                milk-=100;
                coffee_beans-=12;
                cups-=1;
                money+=6;}
                break;

            case "back":
                break;
                        }

        }
    public static void fill(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        System.out.print(">");
        int fill_water=sc.nextInt();
        water+=fill_water;
        System.out.println("Write how many ml of milk you want to add:");

        int fill_milk=sc.nextInt();
        milk+=fill_milk;
        System.out.println("Write how many grams of coffee beans you want to add: ");

        int fill_coffee_beans=sc.nextInt();
        coffee_beans+=fill_coffee_beans;
        System.out.println("Write how many disposable cups you want to add: ");

        int fill_cups=sc.nextInt();
        cups+=fill_cups;
    }
    public static void take(){
        System.out.println("I gave you $"+money);
        money=0;

    }
    public static void remaining(){
        System.out.println(text.formatted(water,milk,coffee_beans,cups,money));
            }
    public static void exit(){
        System.exit(0);
    }
    public static void action(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String choice=sc.next();
        switch(choice){
            case "buy":
                buy();
                break;

            case "fill":
                fill();
                break;

            case "take":
                take();
                break;

            case "remaining":
                remaining();
                break;

            case "exit":
                exit();
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
public static void main(String[] args) {
    while(isTrue){
    action();
    }

    }}


