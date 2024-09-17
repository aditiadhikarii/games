import java.util.Scanner;

public class cargame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cmd of hint for hint : ");
        String hint = sc.nextLine();

        if (hint.equals("hint")){
            System.out.println("Type start to start car");
            System.out.println("Type Stop to stop car");
            System.out.println("Type quit to quit game");
        }

        System.out.println("Enter the cmd you want for the car : ");
        String cmd = sc.nextLine();

        if (cmd.equals("start")){
            System.out.println("Car Started");
        }
        else if (cmd.equals("stop")){
            System.out.println("Car Stopped");
        }
        else if (cmd.equals("quit")){
            System.out.println("Game quited");
        }

        if (cmd.equals("start")) {
            System.out.println("Enter another cmd for the car");
            String cmd2 = sc.nextLine();

            if (cmd2.equals(cmd)) {
                if (cmd2.equals("start")) {
                    System.out.println("Car already started! You cant start car two times.");
                } else if (cmd2.equals("stop")) {
                    System.out.println("Car already stopped! You cant stop car two times.");
                } else if (cmd2.equals("quit")) {
                    System.out.println("Game already quited! You cant quit game two times.");
                }
            }
        }
        }
    }
}