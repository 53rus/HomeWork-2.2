public class Main {
    public static void main(String[] args) {
        Truck man = new Truck("Man", 6);
        Truck scania = new Truck("Scania", 12);
        Car bmw = new Car("BMW", 4);
        Car vw = new Car("Volkswagen", 4);
        Bicycle cube = new Bicycle("Cube", 2);
        Bicycle desna = new Bicycle("Desna", 2);
        outputInfo(man);
    }
   public static void outputInfo(ServiceStation service) {
       service.check();
   }
}