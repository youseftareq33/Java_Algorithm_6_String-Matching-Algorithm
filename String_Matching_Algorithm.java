package pattern_matching_bruteForce;

public class String_Matching_Algorithm {
    public static void main(String[] args) {
        String T = "aabbcdabbcay";
        String P = "bca";

        patternMatch(T, P);
    }

    public static void patternMatch(String T, String P) {
        int n = T.length();
        int m = P.length();
        boolean patternFound = false;

        System.out.println("Position\tMatched Substring");
        for (int s = 0; s <= (n - m); s++) {
            if (P.equals(T.substring(s, s + m))) {
                patternFound = true;
                System.out.println(s + "\t\t" + T.substring(s, s + m));
            }
        }

        if (!patternFound) {
            System.out.println("Pattern not found");
        }
    }
}
