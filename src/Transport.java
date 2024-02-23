import java.util.SortedMap;

public class  Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount() ; i++) {
            System.out.print(i + " ");
            System.out.println("Меняем покрышку " +getModelName());
        }
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель " +getModelName());
    }

    public void checkTrailer() {
        if (getWheelsCount() > 6) {
            System.out.println("Проверяем прицеп " + getModelName());
        }
    }

    public void checkTransport() {
        System.out.println(" Обслуживаем " + getModelName());
    }
}
