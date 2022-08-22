package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="feature//order_restaurant_food.feature"
            ,glue="com.swiggy.testscripts"
           , plugin = {"progress","html:target/cucumber.html"}
            , tags = "@TC_102"
     // ,dryRun = true
    )


//To create testng file of TestRunner class - right click > testNG > convert to Test NG. 
//Inside testNG file created add the code in between <classes>

public class TestRunner extends AbstractTestNGCucumberTests
{

}
	

