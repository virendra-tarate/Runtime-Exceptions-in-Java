// import java.util.Scanner;

public class NumberFormat {
    public static void main(String []array){
        
        try {
            
            int aa = Integer.parseInt("10abcd");
            System.out.println(aa);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);

        }

        System.out.println("Rest of Code ");

    }
}
