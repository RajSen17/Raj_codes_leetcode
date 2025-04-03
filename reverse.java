public class reverse {
    public static void main(String[] args) {
        String s = "Abhay";
        String p = reverseString(s);
        System.out.println("original: " + s);
        System.out.println("reversed: " + p);


    }
    public static String reverseString(String Str){
        StringBuilder sb = new StringBuilder(Str);
        return sb.reverse().toString();



    }

}
