package TaskOne;

public class ListOfGrades {
    private Integer _gradesCount;
    private double[] _grades;
    private final int MAX_NUMBER_OF_GRADES = 25;

    public ListOfGrades(){
        _grades = new double[MAX_NUMBER_OF_GRADES];
        _gradesCount = 0;
    }

    public double[] getGrades() {
        return _grades;
    }

    public Integer getGradesCount() {
        return _gradesCount;
    }

    public void setGrades(double[] grades) {
        this._grades = grades;
    }

    public void setGradesCount(Integer gradesCount) {
        this._gradesCount = gradesCount;
    }

    public void AddGrade(double grade){

             if(_gradesCount < MAX_NUMBER_OF_GRADES){
                 _grades[_gradesCount] = grade;
                 _gradesCount++;
             }
             else{
                 throw new IllegalArgumentException("Max number of grades!");
             }

    }
    public double averageGrade(){
        double sumOfGrades = 0;
        for(int number = 0; number < _gradesCount; number++){
            sumOfGrades += -_grades[number];
        }
        return sumOfGrades / _gradesCount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < _gradesCount - 1; i++ ){
          builder.append(String.format("%.2f", _grades[i]));
        }
        builder.append(String.format("%.2f", _grades[_gradesCount] - 1));
        return builder.toString();
        }
    }