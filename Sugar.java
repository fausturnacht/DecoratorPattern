public class Sugar implements CoffeeDecorator{
    private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Sugar";
    }

    public double getCost(){
        return coffee.getCost() + 10.00;
    }
}