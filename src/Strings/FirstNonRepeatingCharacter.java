package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "aabbcde";

        int[] arr = new int[256];

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        for (char ch : s.toCharArray()) {
            if (arr[ch] == 1) {
                System.out.println("first non Repatiing ::" + ch);
                return;
            }
        }
    }
}
