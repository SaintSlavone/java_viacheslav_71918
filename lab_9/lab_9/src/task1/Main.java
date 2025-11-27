import task1.ExceptionGenerator;

void main() {
    try {
        ExceptionGenerator.generateNullPointerException();
    } catch (NullPointerException e) {
        System.out.println("NullPointerException error occurred:");
        e.printStackTrace();
        e.toString();
    }
}
