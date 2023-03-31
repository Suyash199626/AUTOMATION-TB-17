package com_cjc_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\featurefile\\mercury.feature"},glue={"com_cjc_test"},tags = "@ab or @cd or @ef",plugin = {"pretty","html:target/destination.html"})


public class runner
{

	
	
}
