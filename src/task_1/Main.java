package task_1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(2);
        myList.add(6);
        System.out.println(myList.toString());
        System.out.println("Елемент з індексом 0: " + myList.get(0));
        System.out.println("Елемент з індексом 1: " + myList.get(1));
        System.out.println("Розмір: " + myList.size() + " ел.");
    }
}
