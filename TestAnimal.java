abstract class Animal {
private String name;
public Animal(String name) {
this.name = name;
}
public void display() {
System.out.println("Name: " + name);
}
protected abstract void makeSound();
}
class Dog extends Animal {
public Dog(String name) {
super(name);
}
@Override
protected void makeSound() {
System.out.println("Bow Bow");
}
}
class Cat extends Animal {
public Cat(String name) {
super(name);
}

@Override
protected void makeSound() {
System.out.println("Meow");
}
}
public class TestAnimal {
public static void main(String[] args) {
Animal dog = new Dog("Tommy");
dog.display();
dog.makeSound();
Animal cat = new Cat("Kitty");
cat.display();
cat.makeSound();
}
}
