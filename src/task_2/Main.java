package task_2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();

        myDictionary.add("Key1", 1);
        myDictionary.add("Key2", 2);

        System.out.println("Ключ 1: " + myDictionary.get(0).getKey() + ", значення: " + myDictionary.get(0).getValue());
        System.out.println("Ключ 2: " + myDictionary.get(1).getKey() + ", значення: " + myDictionary.get(0).getValue());

        System.out.println("Розмір: " + myDictionary.size());
    }
}
