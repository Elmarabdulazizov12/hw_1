import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {

        String multiWordVariable;


        final int NUM = 10;


        String word = "мир";


        multiWordVariable = NUM + " " + word;


        System.out.println("multiWordVariable: " + multiWordVariable);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);


        System.out.println("Вы сохранили положительное число");


        System.out.print("Введите ваше имя: ");


        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();


        System.out.println("Привет, " + userName + "!");

        scanner.close();
    }
}
