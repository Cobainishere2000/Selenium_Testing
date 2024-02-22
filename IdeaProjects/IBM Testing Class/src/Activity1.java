public class Activity1 {

    public static void main(String[] args) {

        Car Toyota=new Car();
        Toyota.make=2014;
        Toyota.transmission="Manual";
        Toyota.color="Black";

        Toyota.displayCharacteristics();
        Toyota.accelerate();
        Toyota.brake();
    }
}
