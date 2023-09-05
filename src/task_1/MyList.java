package task_1;
import java.util.ArrayList;
import java.util.List;
/*
Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно
екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання
елемента, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
отримання загальної кількості елементів.
 */
public class MyList<T> {
    private List<T> internalList;

    public MyList(){
        internalList = new ArrayList<>();
    }

    public void add(T item){
        internalList.add(item);
    }
    public T get(int index){
        return internalList.get(index);
    }

    public int size(){
        return internalList.size();
    }

    @Override
    public String toString() {
        return "internalList: " + internalList;
    }
}
