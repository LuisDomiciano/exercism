class ReverseString {

    String reverse(String inputString) {
        String wordReverse = "";
        for (int index = inputString.length() - 1; index > 0; index--) {
            wordReverse += inputString.charAt(index);
        }
        return wordReverse;
    }

}
