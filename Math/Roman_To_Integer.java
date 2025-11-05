import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

    
    public static void main(String[] args) {
        Solution obj = new Solution();

        String roman1 = "III";
        String roman2 = "IX";
        String roman3 = "LVIII";
        String roman4 = "MCMXCIV";

        System.out.println("Roman: " + roman1 + " → Integer: " + obj.romanToInt(roman1));
        System.out.println("Roman: " + roman2 + " → Integer: " + obj.romanToInt(roman2));
        System.out.println("Roman: " + roman3 + " → Integer: " + obj.romanToInt(roman3));
        System.out.println("Roman: " + roman4 + " → Integer: " + obj.romanToInt(roman4));
    }
}
