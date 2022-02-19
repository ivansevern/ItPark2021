package lesson28.MyExampleArhiveRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipRunner {
    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("zipMessages");

    public static void main(String[] args) {
        String zipFileName, WayToZipFile, dirZipWay, dirWayForUnZip, fileZipName;
        Scanner inputScanner = new Scanner(System.in);

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(RESOURCE.getString("app.title3"));
        zipFileName = inputScanner.next();
        System.out.println(RESOURCE.getString("app.title4"));
        WayToZipFile = inputScanner.next();
        WayToZipFile += zipFileName + ".zip";
        System.out.println(RESOURCE.getString("app.title5"));
        dirWayForUnZip = inputScanner.next();

        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(WayToZipFile))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {

                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                // распаковка
                FileOutputStream fout = new FileOutputStream(dirWayForUnZip + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}