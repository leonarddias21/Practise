package sample;

import java.time.Duration;

public class Wait {

}
// Implicit Wait 
driver().manage().timeouts().implicitWait(Duration.ofSeconds(5));
//Explicit wait
WebDriverWait w = new WebDriverWait(driver.ofSeconds(5));
//fluent wait
Wait<Webdriver> wait= new FluentWait<WebDriver>(driver)
.withTimeout (Duration.ofSeconds(30L));
.pollingEvery(Duration.OfSeconds(5l))
.ignoring(NosuchElementException.class);
