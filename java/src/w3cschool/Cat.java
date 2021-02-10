package w3cschool;

import java.util.Objects;

/**
 * Created by Enzo Cotter on 2021/2/9.
 */
public class Cat extends Animal{
    private int age;
    public Cat(){}
    public Cat(int _age){age = _age;}
    public void cry(){
        System.out.println("Miao-Miao!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
