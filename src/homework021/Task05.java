package homework021;

/**
 * FileName: Task05
 * Author:   Andriy Vulook
 * Date:     12.03.2023 22:21
 * Description: MyClass, containing a static factory method - T factoryMethod()
 */

class MyClass<T> {

    private final T instance;

    private MyClass(T instance) {
        this.instance = instance;
    }

    public static <T> MyClass<T> factoryMethod(T instance) {
        return new MyClass<T>(instance);
    }

    public T getInstance() {
        return instance;
    }
}

public class Task05 {

    public static void main(String[] args) {

        //Create instances for types Integer, String, Boolean using the factory method
        MyClass<String> class_S = MyClass.factoryMethod("Hello word");
        MyClass<Integer> class_I = MyClass.factoryMethod(123);
        MyClass<Boolean> class_B = MyClass.factoryMethod(true);

        //Using getInstance method
        String str1 = class_S.getInstance();
        int num1 = class_I.getInstance();
        boolean bool2 = class_B.getInstance();

        System.out.println(str1);
        System.out.println(num1);
        System.out.println(bool2);

    }

}

