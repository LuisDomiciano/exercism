public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].toString().trim();
    }

    public static String logLevel(String logLine) {
        String first = logLine.split(":")[0].toString().trim();
        String out = "";
        for (int i = 1; i < first.length()-1; i++) {
            out += first.charAt(i);
        }
        return out.toLowerCase();
    }

    public static String reformat(String logLine) {
        logLine = logLine.replace('[', '(');
        logLine = logLine.replace(']', ')');
        String first = logLine.split(":")[0].toString().trim();
        String second = logLine.split(":")[1].toString().trim();
        return second + " " + first.toLowerCase();
    }
}
