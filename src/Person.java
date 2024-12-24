public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = ((gender.equals("Male")) ? true : false);
    }

    @Override
    public String toString() {
        return "Hi, i am " + name + surname + ", a " + age + " year old  " + ((gender) ? "male " : "female ");
    }


    public void giveRaise(float percentage){};

    public int getYearsOfExperience() {
        return 0;
    }
}
