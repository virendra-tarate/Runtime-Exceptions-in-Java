import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class FileNotFound {
    public static void main(String []array){
        System.out.println("Enter a Path to open a file :");
        Scanner sc = new Scanner(System.in);

        try {
            String path = sc.nextLine();
            File file = new File(path); 
            FileReader fr = new FileReader(file); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled :"+e);
            System.out.println("File Not Found !");
        }

        System.out.println("Rest of Code");

    }
}
