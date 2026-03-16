package Strings;

import java.util.HashMap;

public class RemovDuplicateFromString {
    public static void main(String[] args) {

        String s = "ABBCCSSSUUUII";

        int[] arr = new int[256];

        for (char ch : s.toCharArray()) {
            arr[ch]++;

            if (arr[ch] == 1) {
                System.out.print(ch);
            }
        }

    }
}
