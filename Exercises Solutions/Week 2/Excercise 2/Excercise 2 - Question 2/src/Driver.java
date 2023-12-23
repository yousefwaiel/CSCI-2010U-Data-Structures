// I started this as question 2, then continued into question 3 since question 3 is a continuation of question 2


public class Driver {
    public static void main(String[] args) {

        // CarbonFootprint class
        CarbonFootprint[] carbonFootprint = new CarbonFootprint[3];
        carbonFootprint[0] = new Bicycle();
        carbonFootprint[1] = new Car(20);
        carbonFootprint[2] = new Building(2500, 50,60,70,80);

        for (int i=0; i<3; i++)
        {
            if (carbonFootprint[i].getClass() == Bicycle.class) {
                System.out.println("Bicycle : " + carbonFootprint[i].getCarbonFootprint());
            }
            else if (carbonFootprint[i].getClass() == Car.class)
            {
                System.out.println("Car : " + carbonFootprint[i].getCarbonFootprint());
            } else if (carbonFootprint[i].getClass() == Building.class) {
                System.out.println("Building : " +carbonFootprint[i].getCarbonFootprint());
            }
        }







// Part of question 2 :
//        // Bicycle
//
//        Bicycle bicycle = new Bicycle();
//        System.out.println("Bicycle : " + bicycle.getCarbonFootprint());
//
//        // Car
//
//        Car car = new Car(60);
//        System.out.println("Car (" + car.gallons +") : " + car.getCarbonFootprint());
//
//        // Building
//
//
//        Building building = new Building(2500 , 50, 60, 70, 80);
//        System.out.println("Building ("+ building.squareFeet +", .... ) : " + building.getCarbonFootprint());
//
//

    }
}