import java.util.Arrays;

public class CrmOptimization {

    // Müşteri Destek Temsilcisi Yönlendirme (Bitmask + DP)
    public static int agentAssignment(int[][] costMatrix) {
        int n = costMatrix.length;
        int[][] dp = new int[n][1 << n];

        // DP dizisini büyük bir değerle doldur (Integer.MAX_VALUE yerine güvenli bir değer seçiyoruz)
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }

        dp[0][1] = costMatrix[0][0];

        for (int mask = 1; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) continue;
                int prevMask = mask & ~(1 << i);
                for (int j = 0; j < n; j++) {
                    if ((prevMask & (1 << j)) != 0) {
                        dp[i][mask] = Math.min(dp[i][mask], dp[j][prevMask] + costMatrix[i][j]);
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            result = Math.min(result, dp[i][(1 << n) - 1]);
        }

        return result;
    }

    // Pazarlama Kampanyası Optimizasyonu (Knapsack DP)
    public static int marketingCampaignSelection(int[] costs, int[] ROIs, int budget) {
        int n = costs.length;
        int[][] dp = new int[n + 1][budget + 1];

        for (int i = 1; i <= n; i++) {
            for (int b = 0; b <= budget; b++) {
                if (costs[i - 1] <= b) {
                    dp[i][b] = Math.max(dp[i - 1][b], dp[i - 1][b - costs[i - 1]] + ROIs[i - 1]);
                } else {
                    dp[i][b] = dp[i - 1][b];
                }
            }
        }

        return dp[n][budget];
    }

    public static void main(String[] args) {
        // Örnek Veri
        int[][] costMatrix = {
            {3, 2, 7},
            {5, 1, 3},
            {8, 6, 2}
        };

        int[] costs = {10, 20, 30, 40};
        int[] ROIs = {60, 100, 120, 140};
        int budget = 50;

        // Çözümleri Çalıştır
        int minCost = agentAssignment(costMatrix);
        int maxROI = marketingCampaignSelection(costs, ROIs, budget);

        System.out.println("Minimum temsilci yonlendirme maliyeti: " + minCost);
        System.out.println("Maksimum pazarlama getirisi: " + maxROI);
    }
}
