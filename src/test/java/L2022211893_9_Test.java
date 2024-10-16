import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class L2022211893_9_Test {

    @Test
    void testPossibleBipartition_ValidCases() {
        Solution9 solution = new Solution9();

        // Test case 1
        assertTrue(solution.possibleBipartition(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}));

        // Test case 2
        assertFalse(solution.possibleBipartition(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}));

        // Test case 3
        assertFalse(solution.possibleBipartition(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}));
    }

    @Test
    void testPossibleBipartition_LargeInput() {
        Solution9 solution = new Solution9();
        int n = 2000; // Testing upper limit
        int[][] dislikes = new int[n - 1][2];

        for (int i = 1; i < n; i++) {
            dislikes[i - 1] = new int[]{i, i + 1}; // Create a long chain
        }

        // This should return true since it can be divided into two groups
        assertTrue(solution.possibleBipartition(n, dislikes));
    }
}
