import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static String name = "";
    static String capital = "";
    static String result = "";
    public static void main(String[] args) throws InterruptedException {
        boolean y = true;
        StartGame();
        while(y == true){
        System.out.println("Please enter game difficulty (easy/medium/hard):");
        String difficulty = input.nextLine();
        GetDifficulty(difficulty.toLowerCase());
        System.out.println("Do you want to play again? yes/no");
        String restart = input.nextLine();
        y = Restart(restart.toLowerCase());
    }
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
        

    }

    public static void GetDifficulty(String diff) throws InterruptedException {
        boolean x = true;
        while (x == true) {
            if (diff.equals("easy")) { // easy level questions
                Thread.sleep(500);
                System.out.println("Let's begin with simple questions, " + name + ":");
                x = false;
                Easy();
                break;
            } else if (diff.equals("medium")) { // medium level questions
                Thread.sleep(500);
                System.out.println("Let's try the medium questions now, " + name + ":");
                x = false;
                Medium();
                break;
            } else if (diff.equals("hard")) { // hard level questions
                Thread.sleep(500);
                System.out.println("Let's try the hardest questions, " + name + "!");
                x = false;
                Hard();
                break;
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
        capital = capital.toLowerCase();
        if(!capital.equals(answer.toLowerCase())){
            System.out.println("Incorrect! The answer is " + answer);
        }
        else System.out.println("Correct!");
    }
    public static Boolean Restart(String restr) throws InterruptedException {
        if(restr.equals("yes")) return true;
        else  return false;
    }
}