public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        checkEngine();
        checkTrailer();
        updateTyre();
    }

}
