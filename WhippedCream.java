public class WhippedCream implements CoffeeDecorator{
    private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", Whipped Cream";
    }

    public double getCost(){
        return coffee.getCost() + 15.00;
    }
}