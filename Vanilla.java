public class Vanilla implements CoffeeDecorator{
    private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Vanilla";
    }

    public double getCost(){
        return coffee.getCost() + 20.00;
    }
}