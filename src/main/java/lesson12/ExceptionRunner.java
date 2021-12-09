package lesson12;

/*
 * Создать исключения:
 * MyArraySizeException (неправильный размер массива), и MyArrayDataException (в ячейке массива лежит что-то не то).
 * Напишите метод, на вход которого подается двумерный строковый массив (String[][]) размером 4х4. При подаче массива
 * другого размера необходимо бросить исключение MyArrayException.
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
 * массива преобразование не удалось (например, в я чейке лежит символ или текст вместо числа), должно быть брошено
 * исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет данных для
 * этой матрицы прекращается.
 * В метод main() нужно вызвать полученный метод, обработать возможные исключения MySizeArrayException и
 * MyArrayDataException и вывести результат расчета.
 *  */

public class ExceptionRunner {
    public static void main(String[] args) {
        ExceptionRunner m = new ExceptionRunner();
        String[][] arg1 = {
                {"1, 1, 1, 1"},
                {"2, 2, 2, 2"},
                {"3, 3, 3, 3"},
                {"4, 4, 4, 4"}
        };
        String[][] arg2 = {
                {"1, 1, 1, 1"},
                {"2, 2, 2, 2"},
                {"3, 3, 3, 3"}
        };
        String[][] arg3 = {
                {"1, 1, 1, 1"},
                {"2, 2, 2"},
                {"3, 3, 3, 3"},
                {"4, 4, 4, 4"}
        };
        try {
            m.StringException(arg1);
            m.StringException(arg2);
            m.StringException(arg3);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public void StringException(String[][] arg) throws MyArraySizeException {
        if (arg.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                    " строке", i));
            for (int j = 0; j < arg[i].length; j++) {
                System.out.print(arg[i][j]);
            }
            System.out.println();
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
