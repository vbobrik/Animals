public class Herbivore extends Animal {
    public Herbivore(double weight) {
        super(weight);
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Error");
        } else {
            super.setWeight(super.getWeight() + food.getWeight());
        }
    }
}
