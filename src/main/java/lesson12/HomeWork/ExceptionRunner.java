package lesson12.HomeWork;

/*
 * Создать исключения:
 * MyArraySizeException (неправильный размер массива), и MyArrayDataException (в ячейке массива лежит что-то не то).
 * Напишите метод, на вход которого подается двумерный строковый массив (String[][]) размером 4х4. При подаче массива
другого размера необходимо бросить исключение MyArrayException.
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
массива преобразование не удалось (например, в я чейке лежит символ или текст вместо числа), должно быть брошено
исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет данных для
этой матрицы прекращается.
 * В метод main() нужно вызвать полученный метод, обработать возможные исключения MySizeArrayException и
 * MyArrayDataException и вывести результат расчета.
 *  */

public class ExceptionRunner {
    public static void main(String[] args) {
        ExceptionRunner myArrayException = new ExceptionRunner();
        ExceptionRunner myArrayDataException = new ExceptionRunner();
        String[][] arg1correct = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        String[][] arg2wrong = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}
        };
        String[][] arg3wrong = {
                {"1", "1", "1", "1"},
                {"2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        String[][] arg4wrongValue = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "a"},
                {"4", "4", "4", "4"}
        };
        try {
            myArrayException.StringException(arg1correct);
            myArrayException.StringException(arg2wrong);
            myArrayException.StringException(arg3wrong);
                 myArrayDataException.StringException(arg4wrongValue);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    //
    public void StringException(String[][] arg) throws MyArraySizeException, MyArrayDataException {
        if (arg.length != 4) throw new MyArraySizeException("неправильный размер массива 1");
        for (int i = 0; i < 4; i++) {
            if (arg[i].length != 4) throw new MyArraySizeException(String.format("неправильный размер массива "));
            for (int j = 0; j < 4; j++) {
                System.out.print(arg[i][j]);
            }
            System.out.println();
        }
            System.out.println("----------------------------------");

        int[] arr = new int[arg.length];
        int sum = 0;
        if (sum != 0) throw new MyArrayDataException("в ячейке массива лежит что-то не то");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            sum = i+i+i+i;
            sum += j+1;
            }
            System.out.println(sum);
        }
    }
    // не уверен, что правильно суммировал массивы.

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
