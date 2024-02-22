public class Car extends Transport implements ServiceStation {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле " + getModelName());
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.print(i + " ");
            updateTyre();
        }
        checkEngine();
    }
}
