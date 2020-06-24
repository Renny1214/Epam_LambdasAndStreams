package palidrome;

import java.util.Arrays;
public interface PalidromeInterface {
    static Object[] findPalindrome(String[] arr) {
        return Arrays.stream(arr)
                .filter(i -> new StringBuilder(i).reverse().toString().equals(i))
                .toArray();
    }
}
