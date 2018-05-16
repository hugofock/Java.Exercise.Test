package test.model;

public final class Student {

    private final int id;
    private final String firstName;
    private final double gpa;

    public Student(final int id, final String firstName, final double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
