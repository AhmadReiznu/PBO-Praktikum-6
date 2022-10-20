//public class praktikum_6_no_1 {
//    public static void main(String[] args) {
//        Truck truck_1 = new Truck();
//        RiverBarge riverBarge_1 = new RiverBarge();
//
//        System.out.println("=== Truck ===");
//        truck_1.getLoad(10);
//        truck_1.getMaxLoad(100);
//        truck_1.addBox(20);
//        truck_1.calcFuelEffieciency(100);
//        truck_1.calcTripDistance(20000);
//        System.out.println("\n");
//
//        System.out.println("=== River Barge ===");
//        riverBarge_1.getLoad(20);
//        riverBarge_1.getMaxLoad(200);
//        riverBarge_1.addBox(40.5);
//        riverBarge_1.calcFuelEffieciency(200);
//        riverBarge_1.calcTripDistance(40000);
//        System.out.println("\n");
//
//    }
//}
//
//class Vehicle{
//    double load = 0;
//    double max_load = 0;
//
//    void getLoad(double load) {
//        System.out.println("Load : " + load);
//    }
//    void getMaxLoad(double max_load) {
//        System.out.println("Max Load : " + max_load);
//    };
//
//    void addBox(double weight) {
//        System.out.println("Add Box : " + weight);
//    };
//
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
//
//class Truck extends Vehicle {
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
//
//class RiverBarge extends Vehicle {
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
