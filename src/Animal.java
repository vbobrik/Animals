abstract public class Animal implements Meat{
    private double weight;

    public double getWeight() {
        return this.weight;
    }

    public Animal(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double eat(Food food);

}
