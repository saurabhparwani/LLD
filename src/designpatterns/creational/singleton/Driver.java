package designpatterns.creational.singleton;
class Driver {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}