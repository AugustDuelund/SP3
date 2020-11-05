import java.util.Scanner;

public class Main {
    Pizza pizza;
    static MariosPizza options;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        options = new MariosPizza();
        options();

    }
    public static void options(){
        System.out.println(options.options.get(0));
        System.out.println(options.options.get(1));
        boolean finished = false;
        while (!finished){
            String choice = scan.nextLine();
            switch (choice){
                case"1":
                    Menu.showMenu();
                    break;
                case"2":
                    Menu.showMenu();
                    System.out.println(options.options.get(2));
                    break;

            }
        }

    }

}

