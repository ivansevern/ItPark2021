package lesson28.MyExampleArhiveRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipRunner {
    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("zipMessages");

    public static void main(String[] args) throws IOException {
        String dirWay, fileName, WayToFile, dirZipWay, dirWayForZip, fileZipName;
        Scanner inputScanner = new Scanner(System.in);

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(RESOURCE.getString("app.title1"));
        dirWay = inputScanner.next();
        System.out.println(RESOURCE.getString("app.title2"));
        fileName = inputScanner.next();
        WayToFile = dirWay + fileName;

        System.out.println(RESOURCE.getString("app.title3"));
        fileZipName = inputScanner.next();
        System.out.println(RESOURCE.getString("app.title4"));
        dirZipWay = inputScanner.next();
        fileZipName += ".zip";
        dirWayForZip = dirZipWay + fileZipName;

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(dirWayForZip));
             FileInputStream fis = new FileInputStream(WayToFile);) {
            ZipEntry entry1 = new ZipEntry(fileName);
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}

