package learn.dp.jdpexamples.c06builder;

abstract class Director {

    /** Director knows how to instruct the builder to create a vehicle. */
    public abstract Vehicle instruct(Builder builder);
}
