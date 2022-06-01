package de.rwu.se4m.pattern;

import java.util.Map;

public class Decision {

    public static final String STATE = "state";
    public static final String INCIDENT = "incident";
    public static final String NORMAL = "Normal";
    public static final String EMERGENCY = "Emergency";

    public static String next(Map<String, Object> ctx) {
        if (!ctx.containsKey(STATE) || !(ctx.get(STATE) instanceof String))
            throw new RuntimeException("No state given or state is no String");

        String currentState = (String) ctx.get(STATE);

        if ((NORMAL.equals(currentState) || "Escalated".equals(currentState)) && ("fire".equals(ctx.get(INCIDENT)) || "riot".equals(ctx.get(INCIDENT))))
            return EMERGENCY;
        if (EMERGENCY.equals(currentState) && "fire".equals(ctx.get(INCIDENT)) && "extinguished".equals(ctx.get("solution")))
            return NORMAL;
        if (EMERGENCY.equals(currentState) && "fire".equals(ctx.get("riot")) && "calmed".equals(ctx.get("solution")))
            return NORMAL;

        throw new RuntimeException("something went wrong");
    }
}
