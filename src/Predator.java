public class Predator extends Animal {

    public Predator(double weight) {
        super(weight);
    }

    @Override
    public double eat(Food food) {

        if(this == food) {
            throw new RuntimeException("Can not eat myself: " + this.getClass().getName());
        }

        if (food instanceof Meat) {
            if (this.getWeight() > food.getWeight()) {
                this.setWeight(this.getWeight() + food.getWeight());
            } else { System.out.println("Error. It's too big meal");}
        } else {
            System.out.println("Error. It's not a meat");
        }
        return super.getWeight();
    }
}



