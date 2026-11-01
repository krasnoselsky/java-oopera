package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Константин", "Станиславский", "Мужской", 42);

        List<Actor> dramaActors = new ArrayList<>();
        dramaActors.add(new Actor("Иван", "Иванов", "Мужской", 185.5));
        dramaActors.add(new Actor("Анна", "Петрова", "Женский", 168.0));

        Show show = new Show("Чайка", 150, director, dramaActors);
        System.out.println(show);

        List<Actor> operaActors = new ArrayList<>();
        operaActors.add(new Actor("Пласидо", "Доминго", "Мужской", 182.0));
        operaActors.add(new Actor("Мария", "Каллас", "Женский", 172.0));

        Opera opera = new Opera("Травиата", 180, director, operaActors);
        System.out.println(opera);
    }
}
