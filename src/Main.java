import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberBox {
    private Number number;

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {

        NumberBox intBox = new NumberBox();
        intBox.setNumber(11);
        Integer integerValue = (Integer) intBox.getNumber();


        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);

//        String str = (String) list.get(0);
//        String integer = (String) list.get(1);

//        Box box = new Box();
//        box.setValue(1);
//        String i = (String) box.getValue();
//        System.out.println(i); // java.lang.ClassCastException

        Box<Integer> box = new Box<>(); // Box is now type safe
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);

        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        String value = stringBox.getValue();


        /**
         * Naming convention
         * T: Type
         * E: Element (used in collections)
         * K: Key (used in maps)
         * V: Value (used in maps)
         * N: Number
         */

//        ArrayList<?> list1 = new ArrayList<>(); // Wildcard entries--> Read-only and can't be modified or add.

//        System.out.println(sum(Arrays.asList(1,2.2,22)));

        List<? super Number> numbers = Arrays.asList(1, 2, 3);
        numbers.add(12);
        numbers.add(null);

    }

    public <T> T getFrist(ArrayList<T> list){
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
        for(T item : source) {
            destination.add(item);
        }
    }

    public static double sum(List<? extends Number> numbers){ // Upper Bound
        double sum = 0;
        for(Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> list) { // Lower Bound
        for (Object object : list) {
            System.out.println(object);
        }
    }
}