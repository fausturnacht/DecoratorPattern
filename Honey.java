public class Honey implements CoffeeDecorator{
    private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Honey";
    }

    public double getCost(){
        return coffee.getCost() + 50.00;
    }
}