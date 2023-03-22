import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int summ=0;
        while (num!=0) {
            if (summ<1000){
                summ+=num;

            }


            num = scanner.nextInt();

        }
        if (summ<1000){
    System.out.println(summ);
        } else{       System.out.println(summ-1000);
    }
}}