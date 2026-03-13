class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < n - 1;) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
                i++;
            } else {
                int add = map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                sum += add;
                i += 2;
            }
        }

        if ( n>1 && map.get(s.charAt(n - 1)) <= map.get(s.charAt(n -          2))) {
            sum += map.get(s.charAt(n - 1));
        }else if(n == 1){
            sum =  map.get(s.charAt(0));   
        }

        return sum;
    }
}
