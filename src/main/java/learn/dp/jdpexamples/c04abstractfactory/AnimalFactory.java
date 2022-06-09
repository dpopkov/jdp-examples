package learn.dp.jdpexamples.c04abstractfactory;

/**
 * Abstract Factory.
 */
public abstract class AnimalFactory {

    protected abstract Tiger createTiger(String color);

    protected abstract Dog createDog(String color);
}
