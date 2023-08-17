package example1;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter score for grammar, spelling, length, and content separated by spaces: ");
        int grammer = keyboard.nextInt();
        int spelling = keyboard.nextInt();
        int length = keyboard.nextInt();
        int content = keyboard.nextInt();

        Essay test = new Essay(grammer, spelling, length, content);
        System.out.println(test.getScore());
        System.out.println(test.getGrade());
        System.out.println("For spelling, you earned: " + test.getSpellingScore() + " points.");
    }
}
