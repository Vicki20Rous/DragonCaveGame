import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1) {
            System.out.println();
        }

    }
}
