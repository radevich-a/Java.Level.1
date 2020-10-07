import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count;
        Integer action;
        Integer lengthAction;
        Animal[] animals;

        System.out.println("Введите количество животных:");
        count   = scanner.nextInt();
        animals = createAnimal(scanner,count);

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Задайте действие для " + animals[i].nameClass + " " + animals[i].getName() + " где: 1 - бегать, 2 - прыгать, 3 - плавать");
            action = scanner.nextInt();
            System.out.println("Введите длину действия в метрах:");
            lengthAction = scanner.nextInt();
            switch (action){
                case 1:
                    System.out.println(animals[i].nameClass + " " +
                            animals[i].getName() + " может пробежать столько " + animals[i].doRun(lengthAction));
                case 2:
                    System.out.println(animals[i].nameClass + " " +
                            animals[i].getName() + " может прыгнуть столько " + animals[i].doJump(lengthAction));
                case 3:
                    System.out.println(animals[i].nameClass + " " +
                            animals[i].getName() + " может проплыть столько " + animals[i].doSwim(lengthAction));

            }

        }

    }

    public static Integer selectionAnimal(Scanner scanner, int i){
        int classAnimal;
        do {
            System.out.println("Выберите ["+(i+1)+"] животное, где: 1 это Кот; 2 это Собака");
            classAnimal = scanner.nextInt();
        } while ((classAnimal < 1) || (classAnimal > 2));

        return classAnimal;
    }

    public static Animal[] createAnimal(Scanner scanner, int count){
        Animal[] arrayAnimals = new Animal[count];

        for (int i = 0; i < arrayAnimals.length; i++) {
            int animal = selectionAnimal(scanner,i);
            System.out.println("Введите имя животного:");
            String nameAnimal = scanner.next();
            switch (animal) {
                case 1:
                    arrayAnimals[i] = new Cat(nameAnimal);
                case 2:
                    arrayAnimals[i] = new Dog(nameAnimal);
            }
        }
        return arrayAnimals;
    }
}
