import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static String name = "";
    static String capital = "";

    public static void main(String[] args) throws InterruptedException {
        StartGame();
        String difficulty = input.nextLine();
        GetDifficulty(difficulty);
    }

    public static void StartGame() throws InterruptedException {
        System.out.println("Loading...10% complete");
        Thread.sleep(500);
        System.out.println("Loading...50% complete");
        Thread.sleep(500);
        System.out.println("Loading...90% complete");
        Thread.sleep(500);
        System.out.println("Loading...99% complete");
        Thread.sleep(1000);
        System.out.println("Loading...100% complete");
        Thread.sleep(500);
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Let's start the game, " + name + "!");
        System.out.println("Please enter game difficulty (easy/medium/hard):");

    }

    public static void GetDifficulty(String diff) throws InterruptedException {
        boolean x = true;
        while (x == true) {
            if (diff.equals("easy")) { // easy level questions
                Thread.sleep(500);
                System.out.println("Let's begin with simple questions, " + name + ":");
                x = false;
                Easy();
            } else if (diff.equals("medium")) { // medium level questions
                Thread.sleep(500);
                System.out.println("Let's try the medium questions now, " + name + ":");
                x = false;
                Medium();
            } else if (diff.equals("hard")) { // hard level questions
                Thread.sleep(500);
                System.out.println("Let's try the hardest questions, " + name + "!");
                x = false;
                Hard();
            } else
                System.out.println("Please enter a valid difficulty (easy/medium/hard) :");
        }
    }

    public static void Easy() throws InterruptedException {
        System.out.println("What is the capital of the United States?");
        Thread.sleep(500);
        capital = input.nextLine();
        while(!capital.equals("Washington")){
            System.out.println("Try again!");
            capital = input.nextLine();
        }
        System.out.println("Correct!");
    }
    public static void Medium(){

    }
    public static void Hard(){

    }
}