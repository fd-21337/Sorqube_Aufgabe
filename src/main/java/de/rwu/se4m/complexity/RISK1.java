package de.rwu.se4m.complexity;

enum RISK1 {

    HIGH("base jumping, paragliding, diving, parcours"),
    MEDIUM("dangerous job, job with high radiation (ultra violet and ionizing radiation)"),
    LOW("everything else");

    RISK1(String s) {
        explanation = s;
    }

    private String explanation;
}