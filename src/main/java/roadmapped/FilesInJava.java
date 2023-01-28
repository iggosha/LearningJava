package roadmapped;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FilesInJava {

    public File file;
    public Scanner scanner = new Scanner(System.in);

    public void createFile(){
        System.out.println("Введите название текстового файла: ");
        file = new File(scanner.nextLine()+".doc");
    }

    public void writeToFile() {
        System.out.println("Введите строку для записи в файл: ");
        String str = scanner.nextLine();
        try {
            FileWriter fw = new FileWriter(file.getPath(), StandardCharsets.UTF_8);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFile(){
        System.out.println("Чтение из файла: ");
        try {
            FileReader fr = new FileReader(file.getPath(), StandardCharsets.UTF_8);
            int symbol;
            while ((symbol=fr.read())!=-1) {
                System.out.print((char) symbol);
            }
            fr.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

