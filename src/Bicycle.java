public class Bicycle extends Transport implements ServiceStation {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед  " + getModelName());
        for (int i = 1; i <= getWheelsCount() ; i++) {
            System.out.print(i + " ");
            updateTyre();
        }
    }
}
