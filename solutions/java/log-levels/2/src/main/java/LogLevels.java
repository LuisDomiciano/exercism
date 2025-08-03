public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].toString().trim();
    }

    public static String logLevel(String logLine) {
        String first = logLine.split(":")[0].toString().toLowerCase().trim();
        return first.substring(first.indexOf('[')+1, first.indexOf(']')).toString().trim(); 
    }

    public static String reformat(String logLine) {
        logLine = logLine.replace('[', '(');
        logLine = logLine.replace(']', ')');
        String first = logLine.split(":")[0].toString().trim();
        String second = message(logLine);
        return second + " " + first.toLowerCase();
    }
}
