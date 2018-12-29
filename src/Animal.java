abstract public class Animal implements Meat, Grass, Food{
    private double weight;
    private String name;

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

  /* public static double calcWeight() {
        if (type == Meat) {
            return this.weight * 0.1;
        }
        return this.weight;
    }*/
}
