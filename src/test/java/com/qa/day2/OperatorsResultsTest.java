package com.qa.day2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OperatorsResultsTest {

    /*
    public static OperatorsResults fail;
    public static OperatorsResults fullMarks;
    public static OperatorsResults justPassed;
    public static OperatorsResults justFailed;
    public static OperatorsResults random;

    @BeforeClass
    public static void initialise(){
        fail = new OperatorsResults(1,1,1);
        fullMarks = new OperatorsResults(150,150,150);
        justPassed = new OperatorsResults((150/10)*6,(150/10)*6,(150/10)*6);
        justFailed = new OperatorsResults(((150/10)*6)-1,1,1);
        random = new OperatorsResults();
    }*/

    @Test
    void printReults() {
        OperatorsResults fail = new OperatorsResults(1,1,1);
        OperatorsResults fullMarks = new OperatorsResults(150,150,150);
        OperatorsResults justPassed = new OperatorsResults((150/10)*6,(150/10)*6,(150/10)*6);
        OperatorsResults justFailed = new OperatorsResults(((150/10)*6)-1,(150/10)*6,(150/10)*6);
        Assert.assertEquals("Physics Mark: " + "1"   + "\nChemistry Mark: " + "1" + "\nBiology Mark: " + "1", fail.printResults());
        Assert.assertEquals("Physics Mark: " + "150"  + "\nChemistry Mark: " + "150" + "\nBiology Mark: " + "150", fullMarks.printResults());
        Assert.assertEquals("Physics Mark: " + "90"  + "\nChemistry Mark: " + "90" + "\nBiology Mark: " + "90", justPassed.printResults());
        Assert.assertEquals("Physics Mark: " + "89"  + "\nChemistry Mark: " + "90" + "\nBiology Mark: " + "90", justFailed.printResults());
    }

    @Test
    void getGradeAsPercentage() {
        OperatorsResults fail = new OperatorsResults(1,1,1);
        OperatorsResults fullMarks = new OperatorsResults(150,150,150);
        OperatorsResults justPassed = new OperatorsResults((150/10)*6,(150/10)*6,(150/10)*6);
        OperatorsResults justFailed = new OperatorsResults(((150/10)*6)-1,(150/10)*6,(150/10)*6);
        Assert.assertEquals(fail.getGradeAsPercentage(), (3/450) *100, 0.7);
        Assert.assertEquals(fullMarks.getGradeAsPercentage(), (450/450) *100, 0);
        Assert.assertEquals(justPassed.getGradeAsPercentage(), 60, 0.8);
        Assert.assertEquals(justFailed.getGradeAsPercentage(), 59,0.8);
    }

    @Test
    void shouldPass() {
        OperatorsResults fail = new OperatorsResults(1,1,1);
        OperatorsResults fullMarks = new OperatorsResults(150,150,150);
        OperatorsResults justPassed = new OperatorsResults((150/10)*6,(150/10)*6,(150/10)*6);
        OperatorsResults justFailed = new OperatorsResults(((150/10)*6)-1,(150/10)*6,(150/10)*6);
        Assert.assertFalse(fail.shouldPass());
        Assert.assertTrue(fullMarks.shouldPass());
        Assert.assertTrue(justPassed.shouldPass());
        Assert.assertFalse(justFailed.shouldPass());
    }

    @Test
    void gradeBreakDown() {
        OperatorsResults fail = new OperatorsResults(1,1,1);
        OperatorsResults fullMarks = new OperatorsResults(150,150,150);
        OperatorsResults justPassed = new OperatorsResults((150/10)*6,(150/10)*6,(150/10)*6);
        OperatorsResults justFailed = new OperatorsResults(((150/10)*6)-1,(150/10)*6,(150/10)*6);
        Assert.assertEquals("Physics failed\n" +
                "Biology failed\n" +
                "Chemistry failed\n", fail.gradeBreakDown());
        Assert.assertEquals("Physics passed\n" +
                "Biology passed\n" +
                "Chemistry passed\n", fullMarks.gradeBreakDown());
        Assert.assertEquals("Physics passed\n" +
                "Biology passed\n" +
                "Chemistry passed\n", justPassed.gradeBreakDown());
        Assert.assertEquals("Physics failed\n" +
                "Biology passed\n" +
                "Chemistry passed\n", justFailed.gradeBreakDown());
    }

    @Test
    void getPercentageGrade() {
        OperatorsResults fail = new OperatorsResults(5,2,2);
        Assert.assertEquals(10.0, fail.getPercentageGrade(15.0), 0.0);
    }
}