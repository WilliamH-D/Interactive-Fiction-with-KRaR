package Logging;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DebugLogger {

    private static DebugLogger instance;
    private String file;

    private DebugLogger() {
        file = "D:\\Documents\\University\\Part II Project\\Interactive Fiction with KRaR\\src\\Logging\\log.txt";
        try {
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
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write("INFO: " + info + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void logDebug(String debug) {
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write("DEBUG: " + debug + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void logError(String error) {
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write("ERROR: " + error + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void logLine() {
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write("\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void logRaw(String raw) {
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write(raw + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
