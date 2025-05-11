class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int i = cost.length-1;

        if (i+1 == 1) return cost[0];
        if (i+1 == 2) return cost[0] + cost[1];

        while (i >= 0) {
            sum += cost[i];
            if (i-1 >= 0) sum += cost[i-1];
            i -= 3;
        }

        return sum;
    }
}