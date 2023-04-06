public class ObjClass {

    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.name = "Lion";
        animal1.noOfLegs = 4;

        Animal animal2 = new Animal();
        animal2.name = "Tiger";
        animal2.noOfLegs = 4;
        System.out.println(animal1);
        System.out.println(animal2);
    }
}
class Animal{
    public String name;
    public int noOfLegs;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
