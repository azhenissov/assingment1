import java.util.ArrayList;

public class School {
    private ArrayList<Person> students = new ArrayList<>();
    public void addMember(Person person) {
        students.add(person);
    }

    @Override
    public String toString() {
        String output = "";
        for(Person person : students) output += person.toString() + "\n";
        return output;
    }
    public void newSalary(){
        for(Person prepod : students){
            if(prepod.getYearsOfExperience()>10){
                prepod.giveRaise(10f);
            }
        }
    }
}
