public class TestCoffee{
    public static void main(String[] args){
        
        //Black coffee
        Coffee blackCoffee = new BlackCoffee();
        System.out.println(blackCoffee.getDescription());
        printCost(blackCoffee);

        //With Milk
        Milk coffeeMilk = new Milk();
        coffeeMilk.setCoffee(blackCoffee);
        System.out.println(coffeeMilk.getDescription());
        printCost(coffeeMilk);

        //Latte With Caramel and Milk
        Latte coffeeLatte = new Latte();

        CaramelSyrup coffeeCaramelSyrup = new CaramelSyrup();
        coffeeCaramelSyrup.setCoffee(coffeeLatte);

        coffeeMilk.setCoffee(coffeeCaramelSyrup);

        System.out.println(coffeeCaramelSyrup.getDescription());
        printCost(coffeeCaramelSyrup);

        //Espresso + Addons
        Espresso espresso = new Espresso();

        Honey coffeeHoney = new Honey();
        coffeeHoney.setCoffee(espresso);

        Sugar coffeeSugar = new Sugar();
        coffeeSugar.setCoffee(coffeeHoney);

        WhippedCream coffeeWhippedCream = new WhippedCream();
        coffeeWhippedCream.setCoffee(coffeeSugar);

        System.out.println(coffeeWhippedCream.getDescription());
        printCost(coffeeWhippedCream);
    }

    public static void printCost(Coffee coffee){
        System.out.println("₱ " + coffee.getCost());
    }
}