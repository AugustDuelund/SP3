import java.util.ArrayList;

public class Menu {
    ArrayList<Pizza>pizzaer = new ArrayList<>();


    @Override
    public String toString() {
        return "I denne menu har vi " + pizzaer.toString();
    }
    public static void showMenu() {
        Menu menu = new Menu();
        Pizza vesuvio = new Pizza("Vesuvio", "Tomatsauce, Ost, Skinke, Oregano", 57, 1);
        Pizza amerikaner = new Pizza("Amerikaner", "Tomatsauce, Ost, Oksefars, Oregano", 53, 2);
        Pizza cacciatore = new Pizza("Cacciatore", "Tomatsauce, Ost, Pepperoni, Oregano", 57, 3);
        Pizza carbona = new Pizza("Carbona", "Tomatsauce, Ost, Kødsovs, Spaghetti, Cocktail Pølser, Oregano", 63, 4);
        Pizza dennis = new Pizza("Dennis", "Tomatsauce, Ost, Skinke, Pepperoni, Cocktail Pølser, Oregano", 65, 5);
        Pizza bertil = new Pizza("Bertil", "Tomatsauce, Ost, Bacon, Oregano", 57, 6);
        Pizza silvia = new Pizza("Silvia", "Tomatsauce, Ost, Pepperoni, Rød Peber, Løg, Oliven, Oregano", 61, 7);
        Pizza victoria = new Pizza("Victoria", "Tomatsauce, Ost, Skinke, Ananas, Champignon, Løg, Oregano", 61, 8);
        Pizza toronfo = new Pizza("Toronfo", "Tomatsauce, Ost, Skinke, Bacon, Kebab, Chili, Oregano", 61, 9);
        Pizza capricciosa = new Pizza("Capricciosa", "Tomatsauce, Ost, Skinke, Champignon, Løg, Oregano", 61, 10);
        Pizza hawai = new Pizza("Hawai", "Tomatsauce, Ost, Skinke, Ananas, Oregano", 61, 11);
        Pizza leblissola = new Pizza("le Blissola", "Tomatsauce, Ost, Skinke, Rejer, Oregano", 61, 12);
        Pizza venezia = new Pizza("Venezia", "Tomatsauce, Ost, Skinke, Bacon, Oregano", 61, 13);
        Pizza mafia = new Pizza("Mafia", "Tomatsauce, Ost, Pepperoni, Bacon, Løg, Oregano", 61, 14);
        menu.pizzaer.add(vesuvio);
        menu.pizzaer.add(amerikaner);
        menu.pizzaer.add(cacciatore);
        menu.pizzaer.add(carbona);
        menu.pizzaer.add(dennis);
        menu.pizzaer.add(bertil);
        menu.pizzaer.add(silvia);
        menu.pizzaer.add(victoria);
        menu.pizzaer.add(toronfo);
        menu.pizzaer.add(capricciosa);
        menu.pizzaer.add(hawai);
        menu.pizzaer.add(leblissola);
        menu.pizzaer.add(venezia);
        menu.pizzaer.add(mafia);
        System.out.println(menu);
    }
}
