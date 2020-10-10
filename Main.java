public class Main {

    public static void main(String[] args) {

        //Cat cat = new Cat("Barsik", 10);
        Plate plate = new Plate(20);

        //cat.eat(plate);
        //System.out.println(cat.getHunger());
        //plate.info();

        Cat[] arrayCat = new Cat[3];
        arrayCat[0] = new Cat("Barsik", 5);
        arrayCat[1] = new Cat("Murzik", 10);
        arrayCat[2] = new Cat("Kotik", 15);

        for (int i = 0; i < arrayCat.length; i++) {
            plate.info();
            arrayCat[i].eat(plate);
            arrayCat[i].getInfoHunger();
        }
        System.out.println();
        plate.addFood(100);
        arrayCat[2].eat(plate);

        for (int i = 0; i < arrayCat.length; i++) {
           arrayCat[i].getInfoHunger();
        }




    }
}
