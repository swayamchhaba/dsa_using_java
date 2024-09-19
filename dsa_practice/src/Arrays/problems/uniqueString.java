package Arrays.problems;

public class uniqueString {
    static boolean checkUniqueString(String s){
        if (s.length() > 128) {
            return false;
        }

        boolean[] checker = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (checker[val]) {
                return false;
            }
            checker[val] = true;

        }
        return true;
    }

    public static void main (String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzz";
        if (checkUniqueString(s)) {
            System.out.println("Unique characters");
        } else {
            System.out.println("not so unique characters");
        }
    }
}
