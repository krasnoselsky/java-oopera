package src;

import java.util.List;

public class Opera extends Show {
    public Opera(String title, int duration, Director director, List<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
    }

    @Override
    public String toString() {
        return "Opera{title='" + getTitle() + "', duration=" + getDuration() + ", director=" + getDirector() + ", listOfActors=" + getListOfActors() + "}";
    }
}
