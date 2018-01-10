import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class HeadlessChrome
{
  @Test
  public void createChromeDriverHeadless() throws IOException
  {
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
      chromeOptions.addArguments("--headless");

      WebDriver driver = new ChromeDriver(chromeOptions);
      driver.navigate().to("https://adobe.com");

      File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // Now you can do whatever you need to do with it, for example copy somewhere
      FileUtils.copyFile(srcFile, new File("/Users/maj/src/screenshot.png"));
      driver.quit();
  }
}
