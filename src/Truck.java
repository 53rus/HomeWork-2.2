public class Truck extends Transport implements ServiceStation{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку  на гурзовике "+ getModelName());
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + getModelName());
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп, " +getModelName() + " Оснащен прицепом");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        if (getWheelsCount() > 6) {
            checkTrailer();
        }
        for (int i = 1; i <= getWheelsCount() ; i++) {
            System.out.print(i + " ");
            updateTyre();
        }
        checkEngine();
    }
}
