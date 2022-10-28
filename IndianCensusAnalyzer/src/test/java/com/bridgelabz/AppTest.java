package com.bridgelabz;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void givenCSVFileShouldLoadData() {
        StateCensusAnalyzer analyser = new StateCensusAnalyzer();
        boolean flag;
        try {
            flag = analyser.loadData();
        } catch (InvalidFileException|InvalidFileTypeException|InvalidDelimiterException|InvalidHeaderException e) {
            flag = false;
        }
        Assert.assertEquals(true,flag);
    }
}
