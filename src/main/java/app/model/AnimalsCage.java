package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal dog;
    private Animal cat;
    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal dog, @Qualifier("cat") Animal cat, Timer time) {
        this.dog = dog;
        this.cat = cat;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString() + ", " + cat.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
//
//    public Timer getTime() {
//        return time;
//    }
}

/*
Кажется понял. класс таймер -> @Component, а в AnimalCage -> вместо new Timer ->объект(бин) таймера. Если не вызывать новый таймер то время совпадает. Исправил
 */