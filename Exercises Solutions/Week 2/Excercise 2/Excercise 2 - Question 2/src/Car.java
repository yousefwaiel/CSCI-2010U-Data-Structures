public class Car extends CarbonFootprint{
    double gallons;
     Car(double gallons){
        this.gallons = gallons;
    }

    @Override
    double getCarbonFootprint() {
         return gallons *20;
    }
}