import MyExceptions.*;

public class Main {
    public static void main(String[] args) {

        String[][] example = {
                {"1","2","3","4"},
                {"5","6","7","8"}
        };

        try {
            System.out.println(twoDimensional(example));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("В ячейке с индексом [" + e.getOne() + "][" + e.getTwo() + "] лежат неверные данные");
            e.printStackTrace();
        }

    }

    public static int twoDimensional(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        if(stringArray[0].length != 4 || stringArray[1].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4 на 4!");
        }

        int tmp;
        int sum = 0;

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                if(!stringArray[i][j].matches("\\d+")) {
                    throw new MyArrayDataException("Значение в соответствующей ячейке не является числом!", i, j);
                }
                tmp = Integer.parseInt(stringArray[i][j]);
                sum += tmp;
            }
        }

        return sum;
    }
}
