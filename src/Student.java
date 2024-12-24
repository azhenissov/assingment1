import java.util.ArrayList;

public class Student extends Person {
    private static int studentID = 0;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
        this.studentID = ++studentID;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public int calculateGPA() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + "I am a student with ID " + studentID;
    }
}
