package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    String say;

    public Cat(String say){
        this.say = say;
    }

    @Override
    void say() {
        System.out.println(say);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
