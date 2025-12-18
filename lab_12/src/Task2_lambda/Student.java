package Task2_lambda;

public class Student {
    String name;
    String surname;
    int score;

    public Student(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public Student() {
        this.name = "";
        this.surname = "";
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  "name: " + name + "\n" +
                "surname: " + surname + "\n" +
                "score: " + score + "\n";
    }
}
