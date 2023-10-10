public class divideBYZero {
    public static void main(String []array){
        try {
            System.out.println(5/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);
        }

        System.out.println("\nRest of Code ");
    }
}
