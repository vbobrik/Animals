public class Herbivore extends Animal {
    public Herbivore(double weight) {
        super(weight);
    }

    public double eat(Food food) {
        if (food instanceof Meat || super.getWeight() < food.getWeight()) {
            System.out.println("Error");
            return super.getWeight();
        } else {
           super.setWeight(super.getWeight() + food.getWeight());
           return super.getWeight();
        }
    }
}
