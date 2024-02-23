public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        updateTyre();
    }

}
