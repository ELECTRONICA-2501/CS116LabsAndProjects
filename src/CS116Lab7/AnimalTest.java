package CS116Lab7;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5, "meow");
        Dog dog = new Dog("Rufus", 3, "bark", "Golden Retriever");
        Cat cat = new Cat("Fluffy", 2, "meow", true);
        Bird bird = new Bird("Tweety", 1, "tweet", "yellow");

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        dog.fetch();
        cat.stratch();
        bird.fly();

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.hasFur());

        System.out.println(bird.getName());
        System.out.println(bird.getAge());

        animal.makeSound();
        dog.makeSound();

        dog.fetch();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }
}
