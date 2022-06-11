package learn.dp.jdpexamples.c06builder;

interface Builder {

    void addBrandName();

    void buildBody();

    void insertWheels();

    /** This method is used to retrieve the vehicle that is constructed. */
    Vehicle getVehicle();
}
