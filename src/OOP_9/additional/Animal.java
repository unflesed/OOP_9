package OOP_9.additional;

public class Animal {
    String name;
    int age;
    boolean tail;
    public Animal(String name, int age, boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
    String isTail(boolean tail){
        return tail ? "есть" : "нет";
    }
    @Override
    public String toString() {
        return  "Имя: " + name + ", возраст: " + age + ", хвост: " + isTail(tail);
    }
}
class Main{
    public static void main(String[] args) {
        Animal cat = new Animal("Васька", 45, false);
        System.out.println(cat);
    }
}
