package de.rwu.se4m.pattern;

import static de.rwu.se4m.pattern.Incident.*;

public class Normal implements State {

    @Override
    public State next(Incident incident, Solution solution) throws IllegalStateTransitionException {
        if (FIRE.equals(incident))
            return new Emergency();
        return null;
    }
}
