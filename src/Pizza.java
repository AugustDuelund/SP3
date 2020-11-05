public class Pizza {

    String name;
    String topping;
    int prize;
    int number;

    public Pizza(String name, String topping, int prize, int number) {
        this.name = name;
        this.topping = topping;
        this.prize = prize;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\n" + number + ") " + name + ": " + topping + ", " + prize + "kr";
    }
}
