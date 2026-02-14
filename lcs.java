import java.util.*;

public class lcs {

    public static int process(List<String> s1, List<String> s2, int l1, int l2) {

        int[][] dp = new int[l1+1][l2+1];

        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.get(i - 1).equals(s2.get(j - 1))) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        List<String> diff = deLines(s1, s2, dp);
        for (String line : diff) {
            System.out.println(line);
        }

        return dp[l1][l2];
    }

public static List<String> deLines(List<String> s1, List<String> s2, int[][] dp) {

    int i = s1.size();
    int j = s2.size();

    List<String> output = new ArrayList<>();

    
    while (i > 0 && j > 0) {

        if (s1.get(i - 1).equals(s2.get(j - 1))) {
            output.add("  " + s1.get(i - 1));
            i--;
            j--;
        }
        else if (dp[i - 1][j] >= dp[i][j - 1]) {
            output.add("- " + s1.get(i - 1));
            i--;
        }
        else {
            output.add("+ " + s2.get(j - 1));
            j--;
        }
    }

    while (i > 0) {
        output.add("- " + s1.get(i - 1));
        i--;
    }
    while (j > 0) {
        output.add("+ " + s2.get(j - 1));
        j--;
    }

    Collections.reverse(output);
    return output;
}

}
