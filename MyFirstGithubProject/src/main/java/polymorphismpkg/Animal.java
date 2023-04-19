package polymorphismpkg;

public class Animal {
    public void makeSound()
    {
        System.out.println("animal is making sound");
    }
}
class Horse extends Animal{
    public void makeSound()
    {
        System.out.println("horse is making sound");
    }
}
class Dog extends Animal{
    public void makeSound()
    {
        System.out.println("dog is making sound");
    }
}