package se.jku.at.inout;

import java.io.PrintStream;
import java.lang.reflect.Field;

public class OutTestHelper {
    public static void redirectOutTo(PrintStream newOut) {
        try {
            Out.close();
        } catch (Exception ignored) {
            // kann ignoriert werden, falls noch nichts offen war
        }
        try {
            Field field = Out.class.getDeclaredField("out");
            field.setAccessible(true);
            field.set(null, newOut);
        } catch (Exception e) {
            throw new RuntimeException("Unable to redirect Out output", e);
        }
    }
}
