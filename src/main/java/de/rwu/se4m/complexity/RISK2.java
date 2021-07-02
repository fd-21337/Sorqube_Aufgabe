package de.rwu.se4m.complexity;

public enum RISK2 {

    HIGH("base jumping, paragliding, diving, parcours", -0.3),
    MEDIUM("dangerous job, job with high radiation (ultra violet and ionizing radiation)", -0.1),
    LOW("everything else", 0.1);

    RISK2(String s, double v) {
        explanation = s;
        value = v;
    }

    private String explanation;

    public double getValue() {
        return value;
    }

    private double value;
}

