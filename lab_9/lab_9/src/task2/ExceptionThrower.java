package task2;

public class ExceptionThrower {
    public static void thrower(int value){
        if(value == 1){
            throw new ArithmeticException();
        }
        if(value == 2){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(value == 3){
            System.out.println("There is no exceptions");
        }
    }
}
