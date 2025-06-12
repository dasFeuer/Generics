public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello World!"};
        test.printArray(intArray);
        test.printArray(stringArray);
    }

    public static <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public static void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
