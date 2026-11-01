package src;

import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public Director getDirector() { return director; }
    public List<Actor> getListOfActors() { return listOfActors; }

    @Override
    public String toString() {
        return "Show{title='" + title + "', duration=" + duration + ", director=" + director + ", listOfActors=" + listOfActors + "}";
    }
}
