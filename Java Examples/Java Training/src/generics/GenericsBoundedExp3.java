package generics;

public class GenericsBoundedExp3<T extends Number> {
    T data;

    GenericsBoundedExp3(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Data value is : " + this.data);
    }

}

class MainClass {
    public static void main(String[] args) {
        GenericsBoundedExp3<Integer> obj = new GenericsBoundedExp3<>(30);
        obj.display();
        GenericsBoundedExp3<Double> obj1 = new GenericsBoundedExp3<>(33.3);
        obj1.display();
        GenericsBoundedExp3<Float> obj2 = new GenericsBoundedExp3<>(33.33f);
        obj2.display();
    }
}
