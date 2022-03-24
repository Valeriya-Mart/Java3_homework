package lesson1;

import java.util.ArrayList;

public class Box <T extends Fruits> {

    ArrayList<T> fruits = new ArrayList();

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruitName){
        fruits.add(fruitName);
    }

    public boolean compare(Box boxToCompare){
        boolean isEqual = false;

        if (this.getWeight() == boxToCompare.getWeight()){
            isEqual = true;
        }

        return isEqual;
    }

    public void moveFruit(Box<T> anotherBox){
        if ( ! this.equals(anotherBox)){
            this.fruits.addAll(anotherBox.fruits);
            anotherBox.fruits.clear();
        }
    }



    public float getWeight(){
        float allWeight = 0f;

        for (int i = 0; i < fruits.size(); i++) {
            allWeight += fruits.get(i).getWeight();
        }

        return allWeight;
    }


}
