# MyTest

Hi, the test was completed using Java+Selenium+Cucumber bundle. The link to Github is - git@github.com:karpushamax/MyTest.git

To run it you will need following jar files:

cucumber-core-1.2.5.jar

cucumber-html-0.2.3.jar

cucumber-java-1.2.2.jar

cucumber-junit-1.1.1.jar

cucumber-jvm-deps-1.0.5.jar

gherkin-2.12.2.jar

junit-4.11.jar

mockito-all-2.0.2-beta.jar

selenium-server-standalone-3.8.1.jar

After adding the above to your project in your IDE (i was using Selenium) you will also need have chromedriver.exe saved at C:\\Users\\bsati\\Documents\\work\\chromedriver.exe (or update src/runner/Definition.java > ublic void i_navigate_to_webpage() method >  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bsati\\Documents\\work\\chromedriver.exe");

After that your should be able to run tests.

Simply press Run and select Junit Runner option

Results will be shown in the console. I didn't have time to include html reporting unfortunatelly













