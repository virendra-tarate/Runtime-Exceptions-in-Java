import java.util.Scanner;

public class missMatch {
    public static void main(String []array){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Integer : ");
            int a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);
        }

        System.out.println("Rest of Code");
    }
}
