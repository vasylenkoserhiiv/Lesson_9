package task_3;


public class MyClass <T>{
    private T data;

    private MyClass(T data){
        this.data = data;
    }
    public static <T> MyClass<T> factoryMethod(T data){
        return new MyClass<>(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
