package Home_Work;

import java.util.Scanner;

public class Calculator {
    public static int a;
    public static int b;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("1. Сумма значений - +");
        System.out.println("2. Сумма значений - -");
        System.out.println("3. Сумма значений - *");
        System.out.println("4. Сумма значений - /");
        System.out.println("5. Выход.");
        System.out.print("> ");
        int opir = scan.nextInt();
        opiration(opir, a, b);
    }

    public static void opiration(int opir, int a, int b){
        boolean flag = true;
        while (flag){
            System.out.println("Введите первое значение");
            System.out.print("> ");
            a = scan.nextInt();
            System.out.println("Введите второе значение");
            System.out.print("> ");
            b = scan.nextInt();
            switch (opir){
                case 1:
                    opir = a + b;
                    System.out.println("Ответ: " + opir);
                    menu();
                    break;
                case 2:
                    opir = a - b;
                    System.out.println("Ответ: " + opir);
                    menu();
                    break;
                case 3:
                    opir = a * b;
                    System.out.println("Ответ: " + opir);
                    menu();
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("На ноль делить нельзя");
                        opiration(opir, a, b);
                    }
                    opir = a / b;
                    System.out.println("Ответ: " + opir);
                    menu();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
