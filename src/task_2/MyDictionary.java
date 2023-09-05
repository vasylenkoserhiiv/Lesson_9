package task_2;
/*
Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні
можливість використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати
метод додавання пар елементів, індексатор для отримання значення елемента за вказаним індексом і властивість тільки
для читання для отримання загальної кількості пар елементів.
 */

import java.util.ArrayList;
import java.util.List;

public class MyDictionary<K, V> {
    private List<Pair<K, V>> internalList;

    public MyDictionary() {
        internalList = new ArrayList<>();
    }

    public void add(K key, V value) {
        //Pair<K, V> pair = new Pair<>(key, value);
        internalList.add(new Pair<>(key, value));
    }

    public Pair<K, V> get(int index) {
        return internalList.get(index);
    }

    public int size() {
        return internalList.size();
    }
}

class Pair<K, V> {
    private final K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }
}