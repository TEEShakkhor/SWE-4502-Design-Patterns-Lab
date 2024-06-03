import java.util.Iterator;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckFactory duckFactory = new DuckFactory();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();

        Quackologist quackologist = new Quackologist();
        Flock flockOfDucks = new Flock();

        Quackable rubberDuck = countingDuckFactory.createDuck("Rubber");
        Quackable woodDuck = countingDuckFactory.createDuck("Wood");
        Quackable tealDuck = countingDuckFactory.createDuck("Teal");

        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(woodDuck);
        flockOfDucks.add(tealDuck);
        flockOfDucks.add(gooseAdapter);

        ((QuackCounter) rubberDuck).registerObserver(quackologist);
        ((QuackCounter) woodDuck).registerObserver(quackologist);
        ((QuackCounter) tealDuck).registerObserver(quackologist);

        Iterator<Quackable> flockIterator = flockOfDucks.createIterator();
        while (flockIterator.hasNext()) {
            Quackable quacker = flockIterator.next();
            quacker.quack();
        }

        System.out.println("Total quacks: " + QuackCounter.getQuackCount());


    }
}
