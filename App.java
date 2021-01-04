import java.util.Scanner;

public class App { // the main class
    static Scanner input = new Scanner(System.in); // this will be used to process user input
    static String name = "";
    static String capital = "";
    static String result = "";
    static int score; // variables used in the code to track score, recond player's name etc
    public static void main(String[] args) throws InterruptedException { // the main method, everything happens here
        boolean y = true; // this is used to allow user to play again
        StartGame();
        while(y == true){ // runs the entire game after it loaded and asked for player's name
        System.out.println("Please enter game difficulty (easy/medium/hard):");
        String difficulty = input.nextLine();
        GetDifficulty(difficulty.toLowerCase());
        System.out.println("Do you want to play again? yes/no");
        String restart = input.nextLine();
        y = Restart(restart.toLowerCase());
        clearScreen();
    }
    }

    public static void StartGame() throws InterruptedException { // loads the game and asks for player's name
        for(int i = 0; i<=100; i++){
        System.out.println("Loading..."+ i+ "% complete");
        
        Thread.sleep(100); // this is used to make the loading a bit longer
        clearScreen();
        }
        System.out.println("Loading complete!");
        Thread.sleep(500);
        System.out.println("What is your name?");
        name = input.nextLine(); // this is now the input object processes user input
        System.out.println("Let's start the game, " + name + "!");
        

    }

    public static void GetDifficulty(String diff) throws InterruptedException {
        boolean x = true; // used to check the validity of a game mode
        while (x == true) {
            if (diff.equals("easy")) { // easy level questions
                Thread.sleep(500);
                System.out.println("Let's begin with simple questions, " + name + ":");
                x = false; // game mode valid, begin game
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
            } else if(!diff.equals("hard") || !diff.equals("medium") || !diff.equals("easy")) // game mode invalid
                System.out.println("Please enter a valid difficulty (easy/medium/hard) :");
                diff = input.nextLine();
        }
        
    }

    public static void Easy() throws InterruptedException { // 5 easy questions
        score = 0; // score tracker refreshed
        Question("the United States", "Washington"); // the questions method is easy-to-use to ask a question
        Question("United Kingdom", "London");
        Question("Canada", "Ottawa");
        Question("Brazil", "Brasilia");
        Question("China", "Beijing");
        System.out.println("You completed the easy questions with a score of " + score + " out of 5!"); // outputs the score
    }
    public static void Medium() throws InterruptedException { //5 medium questions
        score = 0; // score tracker refreshed
        Question("Russia", "Moscow");
        Question("Argentina", "Buenos Aires");
        Question("Egypt", "Cairo");
        Question("India", "New Delhi");
        Question("New Zealand", "Wellington");
        System.out.println("You completed the medium questions with a score of " + score + " out of 5!");
    }
    public static void Hard() throws InterruptedException {  // 5 hard questions
        score = 0; // score tracker refreshed
        Question("Azerbaijan", "Baku");
        Question("Equador", "Quito");
        Question("Madagascar", "Antananarivo");
        Question("Poland", "Warsaw");
        Question("Mongolia", "Ulan Bator");
        System.out.println("You completed the hard questions with a score of " + score + " out of 5!");
    }
    public static void Question(String country, String answer) throws InterruptedException { // this is asking the question and processign the answer
        System.out.println("What is the capital of " +  country + "?");
        Thread.sleep(500);
        capital = input.nextLine();
        capital = capital.toLowerCase(); // user answer is converted to its non-case-sensitive
        if(!capital.equals(answer.toLowerCase())){
            System.out.println("Incorrect! The answer is " + answer); // if incorrect, the 
        }
        else {
            System.out.println("Correct!");
            score++; // a point is earned if the answer is correct
        }
    }
    public static Boolean Restart(String restr) throws InterruptedException { // allows user to restart the game
        if(restr.equals("yes")) return true; 
        else  return false;
    }
    public static void clearScreen() {  //clears the console screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}