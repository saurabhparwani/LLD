/* https://www.geeksforgeeks.org/singleton-design-pattern/
* Singleton is a creational design pattern that lets you ensure that a class has only one instance,
* while providing a global access point to this instance.
* It can be implemented via two ways
* 1. Early Initialisation : Easy to implement but not efficient
* 2. Lazy Initialisation : Efficient approach with double lock check.
* */
package designpatterns.creational.singleton;
class SingleTon
{
    private static volatile  SingleTon obj = null; // Using Volatile to update change in obj to multiple threads

    // private constructor to force use of
    // getInstance() to create Singleton object
    private SingleTon() {}

    public static SingleTon getInstance()
    {
        if (obj==null) { // First check
            synchronized (SingleTon.class) {
                if (obj == null)      // Double check as multiple threads can reach till this step
                    obj = new SingleTon();
            }
        }
        return obj;
    }
}