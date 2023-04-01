package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;

public class PathFinder {
    public static void main(String[] args) {
        /*get method help in storing a path in the reference varaible*/
        Path currentWorking = Paths.get("sure");
        System.out.println(currentWorking.toAbsolutePath());
        try {
            Files.createDirectory(currentWorking);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path path1 = Paths.get("D:\\complete web development\\css-mysite");
        System.out.println(path1.toAbsolutePath());
        System.out.println(Files.exists(path1));

    }
}
