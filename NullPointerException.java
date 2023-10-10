public class NullPointerException {
    public static void main(String []array){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled : "+e);
        }

        System.out.println("Rest of Code ");
    }
}
