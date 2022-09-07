public class Car extends AutoTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTransport() {
        updateTyre();
        checkEngine();
    }
}
