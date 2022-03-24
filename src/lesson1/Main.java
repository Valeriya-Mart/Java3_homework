package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Integer [] array = {1,2,3};
        ArrayList arrayList = new ArrayList();
        ArrayToArrayList(array,arrayList);



        Box<Orange> orangeBox = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

    }


    public static void Change(Object array[], int a, int b) {
        Object element1 = array[a];
        Object element2 = array[b];
        array[a] = element2;
        array[b] = element1;
    }

    public static void ArrayToArrayList (Object array[], ArrayList arrayList){
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
    }
}
