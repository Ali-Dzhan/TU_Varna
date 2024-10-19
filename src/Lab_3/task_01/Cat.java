package Lab_3.task_01;

public class Cat extends Animal{
    private int sleepHours;
    private String furColor;

    public Cat(String name, Integer age, String type, int sleepHours, String furColor) {
        super(name, age, type);
        this.sleepHours = sleepHours;
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cat [" +
                "sleepHours = " + sleepHours +
                ", furColor = " + furColor  +
                ']';
    }
}
