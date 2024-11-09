package TaskOne;

public class Student extends Person {
    private ListOfGrades grades;
    private String fn;

    public Student(String name, Integer age, String fn) {
        super(name, age);
        grades = new ListOfGrades();
        this.fn = fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFn() {
        return fn;
    }
    public double Average(){
        return grades.averageGrade();
    }
    public void PassExam(double grade){
        if(grade > 2.99){
           grades.AddGrade(grade);
        }
        else{
            throw  new IllegalArgumentException("You don't pass");
        }
    }

    @Override
    public String toString() {
      return super.toString() + " fn:" + fn;
    }
}
