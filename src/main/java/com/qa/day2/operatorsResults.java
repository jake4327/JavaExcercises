package com.qa.day2;

public class operatorsResults {
    private int phyMark;
    private int chemMark;
    private int bioMark;
    private final int TOTALMARK = 150;

    public operatorsResults(int phyMark, int chemMark, int bioMark){
        this.phyMark = phyMark;
        this.chemMark = chemMark;
        this.bioMark = bioMark;
    }

    public void printResults(){
        System.out.println("Physics Mark: " + phyMark +
                "\nChemistry Mark: " + chemMark +
                "\nBiology Mark: " + bioMark);
    }

    public double getGradeAsPercentage(){
        return ((phyMark + bioMark + chemMark) /450.0) *100;
    }

    public String shouldPass(){
        if (getGradeAsPercentage() > 60){
            return "Pass";
        } else {
            return "fail";
        }
    }

    public String gradeBreakDown(){
        String review =  "";
        if (getPercentageGrade(phyMark) > 60){
            review += "Physics passed\n";
        } else {
            review += "Physics failed\n";
        }
        if (getPercentageGrade(bioMark) > 60 ){
            review += "Biology passed\n";
        } else {
            review += "Biology failed\n";
        }
        if (getPercentageGrade(chemMark) > 60){
            review += "Chemistry passed\n";
        } else {
            review += "Chemistry failed\n";
        }
        return review;
    }

    public double getPercentageGrade(int grade){
        return grade/TOTALMARK * 100;
    }
}
