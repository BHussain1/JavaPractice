public class Vehicle {
    int speed;
    int doors;
    static int wheels = 4;
    protected String color = "Blue";
    private int gears = 2;

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
    private void totalGears(){
        System.out.println("The Vehicle has gears=" + gears);
    }

}
