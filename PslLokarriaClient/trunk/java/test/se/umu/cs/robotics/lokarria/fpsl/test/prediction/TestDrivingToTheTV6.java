/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.umu.cs.robotics.lokarria.fpsl.test.prediction;

import org.xml.sax.SAXException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.umu.cs.robotics.lokarria.fpsl.LokarriaPslPredictor;
import static org.junit.Assert.*;

/**
 *
 * @author Erik Billing <billing@cs.umu.se>
 */
public class TestDrivingToTheTV6 extends LokarriaPslPredictionTest {
    private String LOG_NAME = "DrivingToTheTV6";

    public TestDrivingToTheTV6() {
    }

    @Test
    public void canPredict() throws SAXException, IOException, InterruptedException {
        int index = getNameIndex(LOG_NAME);
        trainAllFilesExcept(index);
        test(sourceFiles.get(index), index);
        test("DrivingAroundTheCorridor3", index);
    }

}