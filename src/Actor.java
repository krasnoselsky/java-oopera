package src;

public class Actor {
    private String name;
    private String surname;
    private String gender;
    private double height;

    public Actor(String name, String surname, String gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getGender() { return gender; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return "Actor{name='" + name + "', surname='" + surname + "', gender='" + gender + "', height=" + height + "}";
    }
}
