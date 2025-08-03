class MicroBlog {
    public String truncate(String input) {
        if (input == null) return null;
        return input.codePoints()
            .limit(5)
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append
                    )
            .toString();
    }
}
