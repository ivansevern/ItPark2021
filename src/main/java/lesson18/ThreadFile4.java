package lesson18;

import java.io.*;

public class ThreadFile4 {

    public static void main(String[] args) throws IOException {
        try {  // как правильно прописать путь записи файла и как автоматически дать имена файлам, если их будет неизвестно сколько?
            BufferedReader br = new BufferedReader(new FileReader("C:/Razrabotka/ItPark2021/src/main/java/lesson18/data.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:/Razrabotka/ItPark2021/src/main/java/lesson18/result1"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:/Razrabotka/ItPark2021/src/main/java/lesson18/result2"));
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:/Razrabotka/ItPark2021/src/main/java/lesson18/result3"));
            //как прописать путь дефолтный в корень с проектом?

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(br.readLine()).append("\n");

            String line = br.readLine();
            bw3.write(line);
            bw3.close();

            line = br.readLine();
            bw2.write(line);   //не понял как очередность сделать?
            bw2.close();


            line = stringBuilder.toString();
            bw1.write(line);
            bw1.close();

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        }
    }
}


