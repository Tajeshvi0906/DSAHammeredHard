class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        
        // Binary search for the smallest character > target
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < letters[mid]) {
                end = mid - 1;  // Look left, but mid could be answer
            } else {
                start = mid + 1;  // Look right (handles both > and ==)
            }
        }
        
        // start now points to first char > target
        // If start goes out of bounds, wrap around using modulo
        return letters[start % letters.length];
    }
}