//Создать поле игры
//Создать базовую генерацию кораблей
//Дать возможность игроку стрелять
public class Main {
    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        int tries = 5;
        int shipsPerField = 10;


        FieldGenerator fieldGenerator = new FieldGenerator(length, width, shipsPerField);
        int[][] field = fieldGenerator.generate();


        Game game = new Game(field, length, width, tries);
        game.start();


        FieldPrinter fieldPrinter = new FieldPrinter(10);
        fieldPrinter.printField(field);
    }
}