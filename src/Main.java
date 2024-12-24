import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/students.txt");
        File file2 = new File("src/teachers.txt");
        Scanner sc1= new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        School gymn39 = new School();
        while(sc1.hasNext()){
            Student student = new Student(sc1.next(),sc1.next(),
                    sc1.nextInt(),sc1.next());
            while(sc1.hasNextInt()){
                student.addGrade(sc1.nextInt());
            }
            gymn39.addMember(student);
        }
        while(sc2.hasNext()){
            Teacher prepod = new Teacher(sc2.next(), sc2.next(), sc2.nextInt(), sc2.next(),sc2.next(),sc2.nextInt(), sc2.nextInt());
            gymn39.addMember(prepod);
        }
        gymn39.newSalary();
        System.out.println(gymn39.toString());

    }
}