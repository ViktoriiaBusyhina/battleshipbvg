import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;
    private  int shipsPerField;


    public FieldGenerator(int length, int width, int countOfShips) {
        this.length = length;
        this.width = width;
        this.shipsPerField = countOfShips;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShips = 0;
        while (countOfShips < shipsPerField) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);

            if (field[a][b] == 0) {
                field[a][b] = 1;
                countOfShips++;
            }
        }


        //for (int i = 0; i < 100; i++) {
        //    int a = random.nextInt(0, length);
        //    int b = random.nextInt(0, width);
//
        //    if (field[a][b] == 1) {
        //        i--;
        //    }
        //    else {
        //        field[a][b] = 1;
        //    }
        //}
//

        return field;
    }
}
