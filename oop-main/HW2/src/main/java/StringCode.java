import java.util.HashSet;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     *
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        if (str.length() == 0) return 0;
        int max = 1;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count > max) max = count;
            } else count = 1;
        }
        return max;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = str.charAt(i) - 48;
                System.out.println(count);
                for (int j = 0; j < count; j++) {
                    res.append(str.charAt(i + 1));
                }
            } else res.append(str.charAt(i));
        }
        String resStr = res.toString();
        return resStr;
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        if (a.length() < len || b.length() < len) return false;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= a.length() - len; i++) {
            String tempA = a.substring(i, i + len);
            set.add(tempA);
        }

        for (int i = 0; i <= b.length() - len; i++) {
            String tempB = b.substring(i, i + len);
            if (set.contains(tempB)) return true;
        }

        return false;
    }
}
