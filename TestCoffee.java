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

        //With Caramel
        CaramelSyrup coffeeCaramelSyrup = new CaramelSyrup();
        coffeeCaramelSyrup.setCoffee(blackCoffee);
        System.out.println(coffeeCaramelSyrup.getDescription());
        printCost(coffeeCaramelSyrup);
    }

    public static void printCost(Coffee coffee){
        System.out.println("₱ " + coffee.getCost());
    }
}