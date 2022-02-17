package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\hari haran\\eclipse-workspace\\Program\\src\\test\\resources\\Login.feature"},glue= {"org.def"})
public class TestRunner {

}
