package Technical_Interviews;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompoundWordFinder {

    public static void main(String[] args) throws IOException {

        // Step 1: Store the File Path to a String Variable file_path
        String file_path = "/Users/johncho/Desktop/file.txt";

        // Use Buffered Reader to Read Stream from File
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        
        String str;
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
