public class rev {

    public static void main(String[] args) {
        String a = "rajsavita992@gmail.com";
        String p = reverseString(a);
        System.out.println(p);

    }
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();






    }
}