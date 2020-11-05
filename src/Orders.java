import java.util.ArrayList;
import java.util.Scanner;

public class Orders {
    Scanner input = new Scanner(System.in);
    ArrayList<Pizza>orders = new ArrayList<>();
    int nr;
    int pickUp;

    public Orders(int nr, int pickUp) {
        this.nr = nr;
        this.pickUp = pickUp;
    }
}
