import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Какое сейчас время: ");
        int currentTime = sc.nextInt();

        if (currentTime >= 7 && currentTime <= 11){
            System.out.println("Доброе утро ");
        }else if (currentTime >= 11 && currentTime <= 15){
            System.out.println("Добрый день ");
        }else {
            System.out.println("Добрый вечер ");
        }
    }
}