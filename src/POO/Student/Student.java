package POO.Student;

public class Student extends Person {
    private int StudyCredits;

    Student(String name, String address) {
        super(name, address);
    }
    public void study(int credits) {
            this.StudyCredits += credits;
        }

    public int getStudyCredits() {
        return this.StudyCredits;
    }
}
