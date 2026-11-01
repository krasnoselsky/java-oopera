package src;

public class Director {
    private String name;
    private String surname;
    private String gender;
    private int numberOfShows;

    public Director(String name, String surname, String gender, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getGender() { return gender; }
    public int getNumberOfShows() { return numberOfShows; }

    public void setNumberOfShows(int numberOfShows) { this.numberOfShows = numberOfShows; }

    @Override
    public String toString() {
        return "Director{name='" + name + "', surname='" + surname + "', gender='" + gender + "', numberOfShows=" + numberOfShows + "}";
    }
}
