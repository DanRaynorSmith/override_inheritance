public class Runner {
    public static void main(String[] args) {
        Pet defaultReplies = new Pet();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("-".repeat(50));

        defaultReplies.makeNoise();
        cat.makeNoise();
        dog.makeNoise();

        System.out.println("-".repeat(50));

        defaultReplies.doThing();
        cat.doThing();
        dog.doThing();

        System.out.println("-".repeat(50));

    }
}
