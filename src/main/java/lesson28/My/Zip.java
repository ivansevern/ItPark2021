package lesson28.My;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {
    public static final String ZiP_FILE_NAME = "Введите название для zip файла :";
    public static final String ZIP_FOLDER_NAME = "Введите название папки для zip архива :";
    public static final String ZIP_DISK_PATRITION_NAME = "Введите Диск для zip архива:";
    public static final String FILE_NAME = "Введите название файла с расширением :";
    public static final String FOLDER_EXTRACT_NAME = "Введите название папки исходного файла :";
    public static final String DISK_PATRITION_EXTRACT_NAME = "Введите Диск исходного файла:";
    public static final String EXAMPLE_FILE_WAY = "Введите путь до файла: - только с 1 папкой в пути.\nПример C:\\In\\notes.txt\n";
    //    public static final String OUTPUT_ZIP = "C:\\Out\\output.zip";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirDisk, dirWay, fileName, dirName, dirZipDisk, dirZipWay, fileZipName, dirZipName;

        System.out.println(EXAMPLE_FILE_WAY);
        System.out.println(DISK_PATRITION_EXTRACT_NAME);
        dirDisk = scanner.next();

        System.out.println(FOLDER_EXTRACT_NAME);
        dirWay = scanner.next();

        System.out.println(FILE_NAME);
        fileName = scanner.next();

        dirName = dirDisk + ":\\" + dirWay + "\\";

        System.out.println(ZIP_DISK_PATRITION_NAME);
        dirZipDisk = scanner.next();

        System.out.println(ZIP_FOLDER_NAME);
        dirZipWay = scanner.next();

        System.out.println(ZiP_FILE_NAME);
        fileZipName = scanner.next();

        dirZipName = dirZipDisk + ":\\" + dirZipWay + "\\" + fileZipName + ".zip";

        /*System.out.println(EXAMPLE_FILE_WAY);
        System.out.println(DISK_PATRITION_EXTRACT_NAME);
        dirDisk = scanner.next();

        System.out.println(FOLDER_EXTRACT_NAME);
        dirWay = scanner.next();

        System.out.println(FILE_NAME);
        fileName = scanner.next();

        dirName = dirDisk + ":\\" + dirWay + "\\";

        System.out.println(ZIP_DISK_PATRITION_NAME);
        dirZipDisk = scanner.next();

        System.out.println(ZIP_FOLDER_NAME);
        dirZipWay = scanner.next();

        System.out.println(ZiP_FILE_NAME);
        fileZipName = scanner.next();

        dirZipName = dirZipDisk + ":\\" + dirZipWay + "\\" + fileZipName;*/

//        System.out.println("Введите название файла:");
//        System.out.println("Введите путь для упакованного файла:");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");

//        String filename = "C:\\In\\notes.txt";
//        String dirName = "C:\\In\\";
//        String fileName = "notes.txt";

        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(dirZipName));
            FileInputStream fis= new FileInputStream(dirName+fileName);)
        {
//            ZipEntry entry1=new ZipEntry("notes.txt");
            ZipEntry entry1=new ZipEntry(fileName);
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
