package Lab_3.task_01;

public class Dog extends Animal {
    private int commandsLearned;
    private int walksPerDay;

    public Dog(String name, Integer age, String type, int commandsLearned, int walksPerDay) {
        super(name, age, type);
        this.commandsLearned = commandsLearned;
        this.walksPerDay = walksPerDay;
    }

    public int getCommandsLearned() {
        return commandsLearned;
    }

    public void setCommandsLearned(int commandsLearned) {
        this.commandsLearned = commandsLearned;
    }

    public int getWalksPerDay() {
        return walksPerDay;
    }

    public void setWalksPerDay(int walksPerDay) {
        this.walksPerDay = walksPerDay;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Dog [Commands learned = " +
                commandsLearned +
                ", Walks per day = " + walksPerDay + "]";

    }
}

