import java.util.ArrayList;

public class MariosPizza extends Menu{
    ArrayList<String> options = new ArrayList<>();

    public MariosPizza() {
        this.options.add("1) Vis menu");
        this.options.add("2) Bestil");
        this.options.add("Choose a Pizza");

    }
    public void choosePizza() {
        this.options.add("Choose a Pizza");

    }
}
