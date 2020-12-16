import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static String name = "";
    static String capital = "";
    static String result = "";
    public static void main(String[] args) throws InterruptedException {
        StartGame();
        String difficulty = input.nextLine();
        GetDifficulty(difficulty);
        //add a retry thing
        //add a score tracker
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
                diff = input.nextLine();
        }
    }

    public static void Easy() throws InterruptedException {
        Question("the United States", "Washington");
        Question("United Kingdom", "London");
        Question("Canada", "Ottawa");
        Question("Brazil", "Brasilia");
        Question("China", "Beijing");
        System.out.println("You completed the easy questions!");
    }
    public static void Medium() throws InterruptedException {
        Question("Russia", "Moscow");
        Question("Argentina", "Buenos Aires");
        Question("Egypt", "Cairo");
        Question("India", "New Delhi");
        Question("New Zealand", "Wellington");
        System.out.println("You completed the medium questions!");
    }
    public static void Hard() throws InterruptedException {
        Question("Azerbaijan", "Baku");
        Question("Equador", "Quito");
        Question("Madagascar", "Antananarivo");
        Question("Poland", "Warsaw");
        Question("Mongolia", "Ulan Bator");
        System.out.println("You completed the hard questions!");
    }
    public static void Question(String country, String answer) throws InterruptedException {
        System.out.println("What is the capital of " +  country + "?");
        Thread.sleep(500);
        capital = input.nextLine();
        if(!capital.equals(answer)){
            System.out.println("Incorrect! The answer is " + answer);
        }
        else System.out.println("Correct!");
    }
}