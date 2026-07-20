class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                // overlap → merge by extending end
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // no overlap → save current, move to next
                result.add(current);
                current = intervals[i];
            }
        }

        result.add(current); // add last interval
        return result.toArray(new int[result.size()][]);
    }
}