class ReverseString {

    String reverse(String inputString) {
        String wordReverse = "";
        for (int index = inputString.length(); index > 0; index--) {
            wordReverse += inputString.charAt(index);
        }
        return wordReverse;
    }

}
