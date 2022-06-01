package de.rwu.se4m.pattern;

public class Emergency implements State {

    @Override
    public State next(Incident incident, Solution solution) throws IllegalStateTransitionException {
        return null;
    }
}
