package proj_17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public void check() {
        File file = new File("src/proj_17_18/File.md");
        file.delete();
        File mainFile = new File("src");
        searchFiles(mainFile);
    }

    public void searchFiles(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String str : list) {
                searchFiles(new File(String.valueOf(Paths.get(file.getAbsolutePath(), str).toAbsolutePath())));
            }
        } else if (file.getAbsolutePath().endsWith(".java")) {
            readAndWrite(file);
        }
    }

    public void readAndWrite(File file) {

        String mainFilePath = file.getAbsolutePath();
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
                    FileWriter writer = new FileWriter("src/proj_17_18/File.md", true);

            ) {
                writer.write("Next project: " + file.getName() + "\n");
                writer.write("```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.write(line);
                    writer.write('\n');
                    line = reader.readLine();
                }
                writer.write("```\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path");
        } catch (IOException e) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.check();
    }
}








