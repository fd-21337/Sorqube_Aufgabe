package de.rwu.se4m.complexity;

public class Insurance2 {

    /**
     * Checks if an applicant gets an insurance or not.
     *
     * @param age the age of the applicant in years
     * @param married true if the person is married
     * @param numChildren number of children below 18 living in the same household
     * @param risk risk assessment of hobbies and job
     * @return true, if insurance can be offered, false otherwise
     */
    public boolean getInsurance(int age, boolean married, int numChildren, RISK2 risk) {

        if (age > 18 && !(age < 25 && risk == RISK2.HIGH)) {
            var value = 0.5; // start of with a 50%/50% chance
            value = value  + risk.getValue();
            int m = married ? 1 : 0;
            value = value + ((1-m) * 0.05 + 0.05) * ((1-m) * Math.min(numChildren, 4) + m * numChildren) + m * 0.1;
            return value > 0.55;
        }
        return false;
    }
}
