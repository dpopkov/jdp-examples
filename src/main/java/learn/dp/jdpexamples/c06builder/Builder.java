package learn.dp.jdpexamples.c06builder;

interface Builder {

    Builder addBrandName();

    Builder buildBody();

    Builder insertWheels();

    /** This method is used to retrieve the vehicle that is constructed. */
    Vehicle getVehicle();
}
