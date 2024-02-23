import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.FileWriter;

/*
* Messing around with the Java Collections, ArrayList classes and File stuff.
* Basically going to import two .txt files that have "random" numbers
* and going to manipulate some data.  Going to store them in the Java
* Array List class and sort the data after it's been imported.  Using
* a while loop that just checks to see if there is anything next in the
* file.  This assumes clean data and just integers and such.  Then it will
* write a file back with the sorted data. */
public class File_Import {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); // creating any Array List to store our files

        File file1 = new File("input1.txt");
        try (Scanner scanner = new Scanner(file1)) {
            while (scanner.hasNext()) {
                arrayList1.add(scanner.nextInt()); // adding the first file to our Array List
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}