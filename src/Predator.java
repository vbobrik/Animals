public class Predator extends Animal {

    public Predator(double weight) {
        super(weight);
    }

    public double eat(Food food) {
        if (food instanceof Grass || super.getWeight() < food.getWeight()) {
            System.out.println("Error");
        } else {
            super.setWeight(super.getWeight() + food.getWeight());
        }
    }


    /*public static void eat(String name,  double weightFood, Animal animal) {
        if (animal instanceof Herbivore && getWeight < weightFood) {
            System.out.println("Error");
        }

        double newWeight = getWeight + weightFood;
    }*/
}
