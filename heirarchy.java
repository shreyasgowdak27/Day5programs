class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class heirarchy {
    public static void main(String[] args) {
       
        Cat cat=new Cat();
        cat.eat();
        Dog db = new Dog();
        db.eat();

    }
}
