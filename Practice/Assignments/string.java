public class string {
    public static void main(String[] args) {
        String st = "ABCD";
        String res = "";
        for (int i = 0; i < st.length(); i++) {
            res += st.charAt(i) + "  ";

        }
        System.out.println(res);
    }
}
