import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        play(scanner,random);





    }

    static boolean isDraw(char[][] field) {
        int count = field.length * field.length;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-') {
                    count--;
                }
            }
        }
        return count == 0;
    }

    static void play(Scanner scanner, Random random){
        char[][] field = createArray(scanner);

        do {
            setPlayerCoordinate(scanner, field);
            if (isFinal(field, 'X')) {
                break;
            }

            setComputerCoordinate(random, field);
            if (isFinal(field, 'O')) {
                break;
            }
            drawField(field);
        } while (true);

        System.out.println("Final score");
        drawField(field);
    }

    static char[][] createArray(Scanner scanner){

        int count = checkField(scanner);

        char field[][] = new char[count][count];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }
    static int checkField(Scanner scanner){
        int a,b;
        System.out.println("Enter the field size... [a][a]");
        do {
            System.out.println("Enter the length of the horizontal");
            a = scanner.nextInt();
            System.out.println("Enter the length of the vertical");
            b = scanner.nextInt();
        } while (a != b);
        return a;
    }

    static void drawField(char field[][]){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }


    static int getCoordinate(Scanner scanner, char coordName){
        int coord;
        do {
            System.out.println(String.format("Please input - %s,coordinate in range [1, 3]", coordName));
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord > 3);
        return coord;
    }

    static void setPlayerCoordinate(Scanner scanner, char [][] field){
        int x,y;
        do {
            x = getCoordinate(scanner, 'X');
            y = getCoordinate(scanner, 'Y');
        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static void setComputerCoordinate(Random random, char[][] field) {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static boolean isWin(char[][] field, char sign) {
        int count = field.length;

        /**
         * Проверка на горизонталь
         */
        for (int i = 0; i < field.length; i++) {
            count = field.length;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != sign){
                    break;
                } count--;
            } return count == 0;
        }

        /**
         * Проверка на вертикаль

        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }
        */
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                count = field.length;
                if (field[j][i] != sign){
                    break;
                } count--;
            } return count == 0;
        }

        /**
         * TODO Сделать проверку самостоятельно
         * Проверка на диагональ
         */

        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != sign){
                break;
            } count--;
            return count == 0;
        }

        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - i - 1] != sign){
                break;
            } count--;
            return count == 0;
        }

        return false;
    }

    static boolean isFinal(char[][] field, char sign) {
        if (isWin(field, sign)) {
            String name = sign == 'X' ? "Player" : "AI";
            System.out.println(String.format("%s won", name));
            return true;
        }
        if (isDraw(field)) {
            System.out.println("There is draw detected. Thanks god no one won!");
            return true;
        }
        return false;
    }


}
