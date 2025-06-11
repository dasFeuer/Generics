import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

        /**
         * Naming convention
         * T: Type
         * E: Element (used in collections)
         * K: Key (used in maps)
         * V: Value (used in maps)
         * N: Number
         */
    }
}