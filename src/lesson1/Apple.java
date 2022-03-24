package lesson1;

public class Apple extends Fruits {

    public Apple() {
        super.weight = 1.0f;
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }
}
