package TaskOne;

public class Person {
    private String _name;
    private Integer _age;

    public Person(String name, Integer age){
        this._name = name;
        this._age = age;
    }

    @Override
    public String toString() {
        return "Name: " + _name + "', age=" + _age;
    }
}
