package de.rwu.se4m.pattern;

public interface State {
    /**
     * returns the next State for current state and incident and solution
     *
     * @param incident the incident
     * @param solution the solution
     * @return
     */
    State next(Incident incident, Solution solution) throws IllegalStateTransitionException;


    /**
     * implements a next step without a solution
     *
     * @param incident
     * @return
     * @see State#next(Incident, Solution)
     */
    default State next(Incident incident) throws IllegalStateTransitionException {
        return next(incident, null);
    }
}
