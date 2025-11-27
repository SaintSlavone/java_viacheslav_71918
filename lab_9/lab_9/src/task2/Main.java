package task2;

public class Main {
    void main(){
        try{
            System.out.println("Test 1:");
            ExceptionThrower.thrower(1);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException error occurred:");
            e.printStackTrace();
            e.toString();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException error occurred:");
            e.printStackTrace();
            e.toString();
        } finally {
            System.out.println("Final block");
        }

        try{
            System.out.println("Test 2:");
            ExceptionThrower.thrower(2);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException error occurred:");
            e.printStackTrace();
            e.toString();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException error occurred:");
            e.printStackTrace();
            e.toString();
        } finally {
            System.out.println("Final block");
        }

        try{
            System.out.println("Test 3:");
            ExceptionThrower.thrower(3);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException error occurred:");
            e.printStackTrace();
            e.toString();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException error occurred:");
            e.printStackTrace();
            e.toString();
        } finally {
            System.out.println("Final block");
        }
    }
}
