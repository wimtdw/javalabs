package lab21.number4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryListing {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\PA\\Documents\\test scripts";
        List<String> fileList = listFilesInDirectory(directoryPath);

        if (fileList.size() > 0) {
            System.out.println("Первые 5 элементов в каталоге:");
            for (int i = 0; i < Math.min(5, fileList.size()); i++) {
                System.out.println(fileList.get(i));
            }
        } else {
            System.out.println("Каталог пуст.");
        }
    }

    public static List<String> listFilesInDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                Arrays.sort(files); // Сортировка файлов по имени
                for (File file : files) {
                    if (file.isFile()) {
                        fileList.add(file.getName());
                    }
                }
            } else {
                System.err.println("Ошибка при чтении файлов из каталога.");
            }
        } else {
            System.err.println("Каталог не существует или не является директорией.");
        }

        return fileList;
    }
}

