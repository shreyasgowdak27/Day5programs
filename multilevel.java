class Animals{
    void level1(){
        System.out.println("animals is in upper catergory,it is grandparent");
    }
}
class Dog extends Animals{
    void level2(){
        System.out.println("dog is a type of animal in animals,it is parent");
    }
}
class puppy extends Dog{
    void level3(){
        System.out.println("Puppy is child class of Dog or child class of parent");
    }
}
public class multilevel{
    public static void main(String[] args) {
        Animals a=new Animals();
        Dog d=new Dog();
        puppy p=new puppy();
        a.level1();;
        d.level2();
        p.level3();
        System.out.println("This is called multilevel inheritance");
    }
}