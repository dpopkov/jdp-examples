package learn.dp.jdpexamples.c12flyweight;

/**
 * This interface is made to provide common method(s) that accept extrinsic state(s) of flyweights.
 * In this example <code>color</code> is supplied by clients, os it is treated as an extrinsic state.
 */
interface Vehicle {

    void aboutMe(String color);
}
