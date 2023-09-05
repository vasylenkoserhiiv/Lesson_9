package task_3;

public class Main {
    public static void main(String[] args) {
        MyClass<String> stringObj = MyClass.factoryMethod("Hello");
        MyClass<Integer> intObj = MyClass.factoryMethod(111);

        System.out.println(stringObj.getData());
        System.out.println(intObj.getData());
    }
}
