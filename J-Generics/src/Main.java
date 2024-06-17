public class Main {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox<>(10);
        GenericBox stringBox = new GenericBox("Hello");

        System.out.println(integerBox.getData());
        System.out.println(stringBox.getData());
    }
}