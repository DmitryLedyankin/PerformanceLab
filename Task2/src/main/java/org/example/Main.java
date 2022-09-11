package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            String path = new File("src/main/resources/arrayargs.txt").getAbsolutePath();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            ArrayList<Integer> array = new ArrayList<>();

            String line;
            while((line = bufferedReader.readLine()) != null){
                array.add(Integer.parseInt(line));
            }

            int arithmeticMean = 0;
            int minimalCount = 0;
            for (Integer integer : array) {
                arithmeticMean += integer;
            }
            arithmeticMean = arithmeticMean / array.size();

            for (int i = 0; i < array.size(); i++) {
                while(array.get(i) != arithmeticMean) {
                    if (array.get(i) < arithmeticMean) {
                        array.set(i, array.get(i) + 1);
                    } else if (array.get(i) > arithmeticMean) {
                        array.set(i, array.get(i) - 1);
                    }
                    minimalCount++;
                }
            }
            System.out.println(minimalCount);
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Неверный массив элементов " + e);
        } catch (Exception e){
            System.out.println("Произошла не предвиденная ошибка" + e);
        }
    }
}