package de.rwu.se4m.complexity;

public class Insurance1 {

    /**
     * Checks if an applicant gets an insurance or not.
     *
     * @param age the age of the applicant in years
     * @param married true if the person is married
     * @param numChildren number of children below 18 living in the same household
     * @param risk risk assessment of hobbies and job
     * @return true, if insurance can be offered, false otherwise
     */
    public boolean getInsurance(int age, boolean married, int numChildren, RISK1 risk) {
        if (age < 18 || (age < 25 && risk == RISK1.HIGH))
            return false;
        else {
            var value = 0.5; // start of with a 50%/50% chance
            switch (risk) {
                case HIGH:
                    value = value - 0.3;
                    break;
                case MEDIUM:
                    value = value - 0.1;
                    break;
                case LOW:
                    value = value + 0.1;
                    break;
                default:
                    throw new IllegalStateException("Undefined risk level");
            }
            if (married)
                value = value + 0.05 *numChildren + 0.1;
            else {
                if (numChildren > 4) {
                    numChildren = 4;
                }
                value = value + numChildren * 0.1;
            }
            return value > 0.55;
        }
    }
}
