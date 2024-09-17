public class quit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.equals("quit")) {
                break;
            }
//            i = i + 1;
            System.out.println(name);
        }
        scanner.close();

    }
}
    }
