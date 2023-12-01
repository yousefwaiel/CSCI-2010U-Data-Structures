public class Main {
    public static void main(String[] args) {

        // CarbonFootprint class
        CarbonFootprint carbonFootprint = new CarbonFootprint();
        System.out.println("CarbonFootprint class : "+ carbonFootprint.getCarbonFootprint());

        // Bicycle

        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle : " + bicycle.getCarbonFootprint());

        // Car

        Car car = new Car(60);
        System.out.println("Car (" + car.gallons +") : " + car.getCarbonFootprint());

        // Building


        Building building = new Building(2500 , 50, 60, 70, 80);
        System.out.println("Building ("+ building.squareFeet +", .... ) : " + building.getCarbonFootprint());



    }
}