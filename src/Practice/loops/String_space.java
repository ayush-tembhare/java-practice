package Practice.loops;

public class String_space {
    public static void main(String[] args) {

        String s = "Ayush Loves India";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(word.toUpperCase());
                word = "";
            } else {
                word = word + s.charAt(i);
            }
        }

        System.out.println(word.toUpperCase());
    }
}