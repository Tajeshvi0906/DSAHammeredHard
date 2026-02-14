class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    // helper function to process backspaces
    private String build(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                result.append(ch);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    
    }
}