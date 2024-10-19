package Lab_3.task_01;

public class Animal {
    protected String name;
    protected Integer age;
    protected String type;

    public Animal(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal [" +
                "name = " + name +
                ", age = " + age +
                ", type = " + type  +
                ']';
    }

    public double AnnualFoodConsumption(double dailyFoodPortion) {
        return dailyFoodPortion * 365;
    }
}
