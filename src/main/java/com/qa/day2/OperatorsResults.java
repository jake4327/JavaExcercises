package com.qa.day2;

public class OperatorsResults {
    private int phyMark;
    private int chemMark;
    private int bioMark;
    private final int TOTALMARK = 150;

    public OperatorsResults(int phyMark, int chemMark, int bioMark){
        this.phyMark = phyMark;
        this.chemMark = chemMark;
        this.bioMark = bioMark;
    }

    public String printResults(){
        String markResults = "Physics Mark: " + phyMark +
                "\nChemistry Mark: " + chemMark +
                "\nBiology Mark: " + bioMark;
        return markResults;
    }

    public double getGradeAsPercentage(){
        double p = phyMark;
        double b = bioMark;
        double c = chemMark;
        return ((p + b + c) /(TOTALMARK*3)) *100;
    }

    public boolean shouldPass(){
        return getGradeAsPercentage() >= 60;
    }

    public String gradeBreakDown(){
        String review =  "";
        if (getPercentageGrade(phyMark) >= 60){
            review += "Physics passed\n";
        } else {
            review += "Physics failed\n";
        }
        if (getPercentageGrade(bioMark) >= 60 ){
            review += "Biology passed\n";
        } else {
            review += "Biology failed\n";
        }
        if (getPercentageGrade(chemMark) >= 60){
            review += "Chemistry passed\n";
        } else {
            review += "Chemistry failed\n";
        }
        return review;
    }

    public double getPercentageGrade(double grade){
        return (grade/TOTALMARK) * 100;
    }
}
