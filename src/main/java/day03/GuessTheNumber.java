package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private int number;
    private int tipNumber;

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        Random random = new Random();
        guessTheNumber.tipNumber = random.nextInt(100);
        System.out.println(guessTheNumber.calculate());
    }

    public String calculate(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("kérem a tipeket");
            tipNumber = scanner.nextInt();
            if (tipNumber > number){
                System.out.println("A keresett szám kissebb");
            }else if (tipNumber < number){
                System.out.println("A keresett szám nagyobb");
            } else {
                return "kitaláltad a sázmot";
            }
        }
        return "Most nem nyert";
    }
}
