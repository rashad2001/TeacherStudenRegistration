package services;

import java.util.Scanner;

public class MenuStartService extends MenuService {
    public static void startGame() {

    }

    @Override
    public void process() {
        int max = 5;
        int min = 1;
        int newNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == newNumber) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Failed");
        }

    }
}
