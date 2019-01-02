public class Herbivore extends Animal {
    public Herbivore(double weight) {
        super(weight);
    }

    public double eat(Food food) {
        if(this == food) {
            throw new RuntimeException("Can not eat myself: " + this.getClass().getName());
        }
        if (food instanceof Grass) {
            this.setWeight(this.getWeight() + food.getWeight());
        } else {
            System.out.println("Error. It's not a meat");
        }
        return this.getWeight();
    }
}
