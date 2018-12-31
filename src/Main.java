public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant(800);
        Food elephant1 = elephant;
        Food canabis = new Canabis(50);
        Animal lion = new Lion(440);
        Animal yourEx = new YourEx(90);
        Animal rabbit = new Rabbit(200);
        Food flower = new Flower(30);

        System.out.println(elephant.eat(canabis));
        System.out.println(elephant.eat(elephant));
        lion.eat(canabis);
        lion.eat(rabbit);




    }
}
