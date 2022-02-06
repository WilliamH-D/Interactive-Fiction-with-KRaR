package Logging;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DebugLogger {

    private static DebugLogger instance;
    private String file;
    private boolean logging;

    private DebugLogger() {
        file = "src\\Logging\\log.txt";
        logging = true;
        try {
            // Reset the log
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static DebugLogger getInstance() {
        if (instance == null) {
            instance = new DebugLogger();
        }
        return instance;
    }

    public void logInfo(String info) {
        log("INFO: " + info);
    }

    public void logDebug(String debug) {
        log("DEBUG: " + debug);
    }

    public void logError(String error) {
        log("ERROR: " + error);
    }

    public void logLine() {
        log("");
    }

    public void logRaw(String raw) {
        log(raw);
    }

    private void log(String toLog) {
        if (!logging) {
            return;
        }

        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write(toLog + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("A logging error occurred.");
            e.printStackTrace();
        }
    }

    public void stopLogging() {
        logging = false;
    }

    public void startLogging() {
        logging = true;
    }
}
