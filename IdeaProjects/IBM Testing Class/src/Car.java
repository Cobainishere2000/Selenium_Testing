public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car()
    {
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("No of tyres ="+ tyres);
        System.out.println("No of doors ="+doors);
        System.out.println("Make ="+make);
        System.out.println("Transmission =" + transmission);
        System.out.println("Color = " + color);

    }
    public void accelerate(){
        System.out.println("Car is moving forward..");
    }
    public void brake(){
        System.out.println("Car has stopped ");
    }
}
