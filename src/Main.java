import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.println("We are creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing." +'\n');

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? Type a numerical value with up to two decimal places.");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for the red velvet cupcake. Here is the description: ");

        redVelvet.type();

        System.out.println("How much would you like to charge for the red velvet cupcake?" + "\nEnter a numerical number with two decimal places.");


        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for the chocolate cupcake. Here is the description: ");

        chocolate.type();

        System.out.println("How much would you like to charge for the chocolate cupcake?" +
                "\nEnter a numerical number with two decimal places.");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda ();
        Milk milk = new Milk();

        System.out.println("We are creating the drink menu. We currently have three types of drinks on" + "\nthe menu but we need to decide on pricing.");

        System.out.println("We are deciding on the price for bottled water. Here is the description: ");

        water.type();

        System.out.println("How much would you like to charge for a bottle of water? Again, use two decimal places.");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for a can of soda. Here's the description:");

        soda.type();

        System.out.println("How much shall we charge for a can of pop? Fine. '*SODA*'.  Please use two decimal places, as usual.");

        priceText =input.nextLine();
        price =Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for a bottle of milk. Here's the description:");

        milk.type();

        System.out.println("How much shall we charge for a bottle of milk from a cow?  Please use two decimal places, as usual.");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

    new Order (cupcakeMenu, drinkMenu);

    }
}
class Cupcake {
    public double price;

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting.");
    }
}

class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet-based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {

    public void type() {
        System.out.println("A chocolate-based cupcake, with chocolate frosting.");
    }
}

class Drink {

    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A bottle of presumably potable water.");
    }
}

class Soda extends Drink{
    public void type() {System.out.println("A can of soda, otherwise known as 'pop.'");}
}
class Milk extends Drink{
    public void type() {System.out.println("A bottle of 'whole' cow's milk.");}
}












