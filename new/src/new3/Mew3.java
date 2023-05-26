package new3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mew3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver_win32\\geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://pro.arcgis.com/en/pro-app/latest/arcpy/functions/listtables.htm");
		WebElement table= driver.findElement(By.xpath("//*[@id=\"S2_GUID-B4DCC19B-F2BA-475E-B84E-267138AE9CF5\"]/div[1]"));
		List<WebElement> rows=driver.findElements(By.tagName("td"));
		for(WebElement row:rows)
		{
			List<WebElement> columns=driver.findElements(By.tagName("tr"));
			for(WebElement column:columns)
			{
				System.out.println(column.getText());
			}
			driver.findElement(By.xpath("cf")).click();
			Set<String> windows=driver.getWindowHandles();
			for(String window:windows) {
				driver.switchTo().window(window);
				if(driver.getCurrentUrl().equals("url"))
                 break;
			}
		}
		}
	}

