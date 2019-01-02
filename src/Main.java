public class Main {
    public static void main(String[] args) {

        // create animals
        Animal elephant = new Elephant(800);
        Animal yourEx = new YourEx(90);
        Animal rabbit = new Rabbit(200);
        Animal lion = new Lion(440);

        // create Grass
        Grass cannabis = new Canabis(50);
        Grass flower = new Flower(100);

        // create food
        Food cannabisGrass = cannabis;
        Food elephantMeat = elephant;
        Food rabbitFood = rabbit;
        Food lionFood = lion;
        Food flowerFood = flower;
        Food yourExFood = yourEx;

// create lunch
        lion.eat(rabbitFood);
        System.out.println("Weight of lion is " + lion.getWeight());
        lion.eat(elephantMeat);
        System.out.println("Weight of lion is " + lion.getWeight());
        lion.eat(rabbitFood);
       // elephant.eat(elephantMeat);
        System.out.println("Weight of lion is " + lion.getWeight());
        lion.eat(elephantMeat);
        System.out.println("Weight of lion is " + lion.getWeight());
        System.out.println("------------------");
        elephant.eat(lionFood);
        System.out.println("Weight of elephant is " + elephant.getWeight());
         rabbit.eat(flowerFood);
        System.out.println("Weight of rabbit is " + rabbit.getWeight());
       // rabbit.eat(rabbit);
        lion.eat(flowerFood);






    }
}
