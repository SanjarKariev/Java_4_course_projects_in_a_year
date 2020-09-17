package Home_Work;

import static Home_Work.Calculator.scan;

public class Interval {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Впишите число и программа покажет в какой диапазон от 0 до 100 вы попали."
                + "\n"
                + "Чтобы выйти из программы введите: (111)");
        System.out.println(" ");
        input();
    }
    public static void input(){
        System.out.println("Введите число");
        System.out.print("> ");
        int number = scan.nextInt();
        numericRange(number);
    }
    public static void numericRange(int number){
        if (number < 0 || number >100){
            System.out.println("Вы вышли за указанные рамки условия ввода!"
                    + "\n"
                    + "Попробуйте снова.");
            input();
        }
        exit(number);
        System.out.print("Вы попали в диапозон: ");
        if (number < 15) {
            System.out.println("0-14");
            input();
        } else if (number <= 35) {
            System.out.println("15-35");
            input();
        } else if (number <= 50) {
            System.out.println("36-50");
            input();
        } else if (number <= 100) {
            System.out.println("51-100");
            input();
        }
    }
    private static void exit(int number){
        if (number == 111) {
            System.out.println("Спасибо за игру, удачи!");
            System.exit(1);
        }
    }
}
