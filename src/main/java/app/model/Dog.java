package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{

    String say;

    public Dog(String say){
        this.say = say;
    }

    @Override
    void say() {
        System.out.println(say);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
