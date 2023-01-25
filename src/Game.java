import java.util.Scanner;

public class Game {

    private int[][] field;

    private int length;
    private int width;
    private int tries;

    public Game(int[][] field, int length, int width, int tries) {
        this.field = field;
        this.length = length;
        this.width = width;
        this.tries = tries;
    }

    public Game(int[][] field) {
        this.field = field;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        for (int i = 0; i < tries; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];

                if (shot == 0) {
                    System.out.println("Вы не попали");
                }
                else {
                    System.out.println("Вы попали");
                    x++;
                    field[first][second] = 2;
                }
            }
            else {
                System.out.println("Что-то куда-то не туда");
            }




        }
        System.out.println("Сумма очков:" + x);

        //подсчет очков

        //тут как-то нужно играть
    }

}
