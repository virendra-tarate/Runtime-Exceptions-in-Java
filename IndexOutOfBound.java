public class IndexOutOfBound {
    public static void main(String []array){
        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);
            
        }

        System.out.println("REst of Code ");
    }
}
