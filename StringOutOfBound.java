public class StringOutOfBound {
    public static void main(String []array){
        try {
            String ab = "Hello Friends";
            System.out.println(ab.charAt(19));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);
        }

        System.out.println("Rest of Code");
    }
}
