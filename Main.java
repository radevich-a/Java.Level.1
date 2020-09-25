import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber;
        Scanner scanner = new Scanner(System.in);
        int yesOnNo = 1;

        randomNumber = createRandomNumbers();

        do{
            if (yesOnNo == 1)
            getResult(false,randomNumber);
            System.out.println();
            System.out.println("Do you want to play?");
            System.out.println("YES: 1, NO: 0");
            yesOnNo = scanner.nextInt();
        } while (true);

    }

    static int createRandomNumbers() {
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(10);
        return randomNumber;
    }
    static boolean play(int randomNumber, boolean is){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int count = 0;
        while (count <= 2){
            System.out.println("Make a number...");
            userNumber = scanner.nextInt();
            if (userNumber == randomNumber){
                is = true;
                break;
            } else {
                if (userNumber > randomNumber) {
                    System.out.println("number > random number!");
                } else System.out.println("number < random number!");
            }
            System.out.println("Not guess. Try again ...");
                count++;
            }
        return is;
    }
    static void getResult(boolean play, int randomNumber){
        System.out.println("Start game!");
        if (play(randomNumber,false)){
            System.out.println("!!! You win !!!");
        } else System.out.println("*** Game over ***");
    }

}
