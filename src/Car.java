public class Car extends Transport  {
    public Car(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Обслуживаем легковой автомобиль " + getModelName());
        updateTyre();
        checkEngine();
    }


}
