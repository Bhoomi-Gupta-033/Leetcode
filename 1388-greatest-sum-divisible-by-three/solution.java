class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        for (int num : nums) {
            sum += num;
            if (num % 3 == 1) mod1.add(num);
            else if (num % 3 == 2) mod2.add(num);
        }

        Collections.sort(mod1);
        Collections.sort(mod2);

        int mod = sum % 3;

        if (mod == 0) return sum;

        if (mod == 1) {
            int remove1 = mod1.size() >= 1 ? mod1.get(0) : Integer.MAX_VALUE;
            int remove2 = mod2.size() >= 2 ? mod2.get(0) + mod2.get(1) : Integer.MAX_VALUE;
            return sum - Math.min(remove1, remove2);
        }

        // mod == 2
        int remove1 = mod2.size() >= 1 ? mod2.get(0) : Integer.MAX_VALUE;
        int remove2 = mod1.size() >= 2 ? mod1.get(0) + mod1.get(1) : Integer.MAX_VALUE;

        return sum - Math.min(remove1, remove2);
    }
}
