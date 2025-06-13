public class ExceptionGenerics {
    public static void main(String[] args) {
        try{
            throw new MyException(123);
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try{
            throw new MyException("String");
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

class MyException extends Exception {
    public <T> MyException(T value){
        super("Exception related to value: " +
                value.toString() +
                " of type: " +
                value.getClass().getName()
        );
    }
}

class StringProcessingException extends Exception{
    public StringProcessingException(String message){
        super(message);
    }
}

class IntegerProcessingException extends Exception{
    public IntegerProcessingException(String message){
        super(message);
    }
}
