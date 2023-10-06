package com.days.day44;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("training.txt");
        if (!file.exists()) {//if the file doesnt exist
            file.createNewFile();// create a new file
        }
//                                   path from repository root
        File file1 = new File("src/com/days/day44/names.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        //                           absolute path
        File file2 = new File("C:\\Users\\ahmet\\IdeaProjects\\JavaBatch_12\\src\\com\\days\\day44\\clubs.txt");
        if (!file2.exists()) {
            file1.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Hello!!!!");
        writer.write("Javaaaaa!!!!");
        writer.write("\nCome on!!!");
        writer.close();
        FileWriter writer1 = new FileWriter("src/com/days/day44/names.txt");
        writer1.write("Kilic");
        writer1.write("\nErkan");
        writer1.close();
        FileWriter writer2 = new FileWriter("src/com/days/day44/names.txt", true);
        writer2.write("\nFaruk");
        writer2.close();
        ArrayList<String> namesFromFile = new ArrayList<>();
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
            namesFromFile.add(scanner.next());
        }
        scanner.close();
        System.out.println("namesFromFile = " + namesFromFile);

        file.delete();
        file2.delete();

        //create directory
        File file3 = new File("src/com/days/day45");
        file3.mkdir();
        File file4 = new File("src/com/days/day45/training.java");
        file4.createNewFile();
        File file5 = new File("cities.txt");
        file5.createNewFile();
        FileWriter writer3 = new FileWriter(file5);
        writer3.write("Oslo");
        writer3.write("\nLondon");
        writer3.write("\nIstanbul\n");
        writer3.write("Roma");
        writer3.write("\nMadrid");
        writer3.close();
        createAFile("fruits.txt");


    }

    //create a method to create a file
    public static void createAFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
