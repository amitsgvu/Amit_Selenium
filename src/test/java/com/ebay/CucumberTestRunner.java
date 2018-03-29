package com.ebay;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * This is runner for cucuber framework executionn
 * @author Amit.Sharma4
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.ebay.steps"},
        format = {"pretty", "html:report"},
        features = "src/test/resources"
)
public class CucumberTestRunner {

}
