# SwiggyProject

Steps Performed :

1 . Open Eclipse and create Maven Project 
 Delete Default packages from maven Project
2.Add the following Dependencies in POM.xml : 

<dependencies>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-core  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-core</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-testng  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-testng</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm-deps  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-jvm-deps</artifactId>
<version>1.0.6</version>
<scope>provided</scope>
</dependency>
<!--  https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting  -->
<dependency>
<groupId>net.masterthought</groupId>
<artifactId>cucumber-reporting</artifactId>
<version>5.7.0</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/gherkin  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>gherkin</artifactId>
<version>23.0.1</version>
</dependency>
<!--  https://mvnrepository.com/artifact/org.testng/testng  -->
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.5</version>
<scope>test</scope>
</dependency>
<!--  https://mvnrepository.com/artifact/com.beust/jcommander  -->
<dependency>
<groupId>com.beust</groupId>
<artifactId>jcommander</artifactId>
<version>1.82</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-html  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-html</artifactId>
<version>0.2.7</version>
</dependency>
<!--  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java  -->
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.1.1</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-core  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-core</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-testng  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-testng</artifactId>
<version>7.3.4</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm-deps  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-jvm-deps</artifactId>
<version>1.0.6</version>
<scope>provided</scope>
</dependency>
<!--  https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting  -->
<dependency>
<groupId>net.masterthought</groupId>
<artifactId>cucumber-reporting</artifactId>
<version>5.7.0</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/gherkin  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>gherkin</artifactId>
<version>23.0.1</version>
</dependency>
<!--  https://mvnrepository.com/artifact/org.testng/testng  -->
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.5</version>
<scope>test</scope>
</dependency>
<!--  https://mvnrepository.com/artifact/com.beust/jcommander  -->
<dependency>
<groupId>com.beust</groupId>
<artifactId>jcommander</artifactId>
<version>1.82</version>
</dependency>
<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-html  -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-html</artifactId>
<version>0.2.7</version>
</dependency>
<!--  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java  -->
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.1.1</version>
</dependency>
<!--  https://mvnrepository.com/artifact/com.vimalselvam/cucumber-extentsreport  -->
<dependency>
<groupId>com.vimalselvam</groupId>
<artifactId>cucumber-extentsreport</artifactId>
<version>3.1.1</version>
</dependency>
</dependencies>

1.Create Folder with name Feature and create a file "Order_restaurant_food.feature" 
2.Write the feature and Scenerio in feature file - generate glue code.
3. Created 2 packages - one for pages and other for testscripts
  Using that feature file snippets write step defnition OrderFoodSteps.java in com.swiggy.testscripts
4.Convert the Maven project[OrderFoodSteps.java] to testNG
5.Implement Page object design model and write source code according to feature file .

Feature: Swiggy Food Order

@TC_102
Scenario: Order food from swiggy

Given user is in the landing page of swiggy

When user clicks on  'Bangalore , Karnataka, India' hyperlink

And click on search bar
And enter 'BTM' restaurant on search bar
And hover over 'BTM Layout' and click
And Click on the first restaurant on the next page
And Click 'Add' on the first item of the restaurant page
And Click 'Checkout' button

Then Verify you are on Checkout page by verifying the text . 

Executed the testNG file to see the results. Test case executed successfully.
