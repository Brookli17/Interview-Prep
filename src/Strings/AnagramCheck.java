package Strings;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;

        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println(isAnagram("silent","listen"));
    }
}
