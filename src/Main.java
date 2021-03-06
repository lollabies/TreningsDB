
/**
 * Created by Erlend on 13.03.2017.
 */
public class Main {

    GetInputs in;

    public Main() {
        init();
        run();
    }

    public void init() {
        //stuff
    }

    public void run() {
        getUserFunction();
    }

    public void getUserFunction() {
        this.in = new GetInputs();
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("");
            System.out.println("Which function do you want to use?");
            System.out.println("Input workout | Best workout | Statistics");
            input = in.getStringInput("");
            if (input.trim().toLowerCase().equals("input workout")) {
                inputWorkout();
            } else if (input.trim().toLowerCase().equals("best workout")) {
                bestWorkout();
            } else if (input.trim().toLowerCase().equals("statistics")) {
                statistics();
            } else if (!input.equals("quit")){
                System.out.println("Not a valid input");
            }
        }
        in.closeScanner();
    }

    //Inputs a workout to the database
    public void inputWorkout() {
        String input;
        Workout workout = new Workout();
        input = in.getStringInput("Do you want to add a note?");
        if (input.toLowerCase().equals("yes")||input.toLowerCase().equals("y")) {
           workout.addNote();
        }
        int num = in.getIntInput("How many exercises did you do?");
        for (int i = 0; i<num; i++) {
            System.out.println("Inputting exercise number " + Integer.toString(i+1));
            workout.addResult();
        }
    }

    //Gets the best workout in the last 7 days
    public void bestWorkout() {
        System.out.println("Calculating the best workout");
    }

    //Gets statistics from the database
    public void statistics() {
        System.out.println("Fetching statistics");
    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
