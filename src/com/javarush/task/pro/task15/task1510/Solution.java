package com.javarush.task.pro.task15.task1510;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
            InputStream stream = System.in;
            Scanner scanner = new Scanner(stream);
            Files.write(Path.of(scanner.nextLine()), bytes);
            scanner.close();
            stream.close();
    }
}

