package Lab_3.task_01;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Willy",2,"mammal",3,1);
        Dog dog2 = new Dog("Wes",3,"mammal",10,3);
        Dog dog3 = new Dog("Bob",1,"mammal",4,2);

        Cat cat1 = new Cat("Kiro",12, "mammal",10,"orange");
        Cat cat2 = new Cat("Pesho",5, "mammal",16,"white");
        Cat cat3 = new Cat("Benny",9, "mammal",14,"black");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);

        for (Animal animal : animals){
            System.out.println(animal.toString());
        }

        Animal[] animalsArr = new Animal[4];

        animalsArr[0] = dog1;
        animalsArr[1] = dog2;
        animalsArr[2] = cat3;
        animalsArr[3] = cat2;

        double[] dailyFoodPortions = {0.500, 0.600, 0.200, 0.800};
        double totalAnnualConsumption = 0;

        for (int i = 0; i < animalsArr.length; i++) {
            double annualFoodForAnimal = animalsArr[i].AnnualFoodConsumption(dailyFoodPortions[i]);
            totalAnnualConsumption += annualFoodForAnimal;
            System.out.println(animalsArr[i].getName() + " will consume "
                    + annualFoodForAnimal + " kg food for a year.");
        }

        System.out.println("The total food consumed in kg will be " + totalAnnualConsumption + "kg.");
        double averagePriceForFoodPerKg = 4.50;
        double totalPrice = totalAnnualConsumption * averagePriceForFoodPerKg;
        System.out.println("The cost for the yearly consumed food will be " + totalPrice + "lv." );
    }
}
