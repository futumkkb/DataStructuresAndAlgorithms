class ReverseVowelOfAString {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            if (isVowel(ch[left]) && isVowel(ch[right])) {
                swap(ch, left, right);
                left++;
                right--;
            } else if (isVowel(ch[left])) {
                right--;
            } else {
                left++;
            }
        }
        return new String(ch);
    }

    public boolean isVowel(Character c) {
        return c.equals('a') || c.equals('A') ||
                c.equals('e') || c.equals('E') ||
                c.equals('i') || c.equals('I') ||
                c.equals('o') || c.equals('O') ||
                c.equals('u') || c.equals('U');
    }

    public void swap(char[] arr, int pos0, int pos1) {
        char temp = arr[pos0];
        arr[pos0] = arr[pos1];
        arr[pos1] = temp;
    }
}