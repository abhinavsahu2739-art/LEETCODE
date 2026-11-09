class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        // Trailing spaces skip karo
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Last word ke characters count karo
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}