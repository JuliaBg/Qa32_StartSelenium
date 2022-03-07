import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();

       WebElement el = wd.findElement(By.cssSelector("table#customers td:nth-child(2)"));
    }
    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/ja321/Downloads/index.html");
        wd.manage().window().maximize();

        WebElement item1 = wd.findElement(By.cssSelector("[href ='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("a.nav-item[href ='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("[href ='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("#nav ul li:last-child"));
        WebElement item5 = wd.findElement(By.cssSelector("#nav ul li:nth-child(2)"));

        WebElement input1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement input2 = wd.findElement(By.cssSelector("#form1 input:first-child"));
        WebElement button = wd.findElement(By.cssSelector(".btn"));
        WebElement input3 = wd.findElement(By.cssSelector("#form1 input:nth-child(2)"));
        WebElement input4 = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement input5 = wd.findElement(By.cssSelector("[name='name']"));
        WebElement input6 = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement button1 = wd.findElement(By.cssSelector("#form1 button:last-child"));

        WebElement europe = wd.findElement(By.cssSelector("#country-table tr:first-child td:first-child"));
        WebElement europeU = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:first-child"));
        WebElement europeG = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:first-child"));
        WebElement europeP = wd.findElement(By.cssSelector("#country-table tr:last-child td:first-child"));

        WebElement asia = wd.findElement(By.cssSelector("#country-table tr:first-child td:nth-child(2)"));
        WebElement asiaI = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        WebElement asiaR = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:nth-child(2)"));
        WebElement asiaC = wd.findElement(By.cssSelector("#country-table tr:last-child td:nth-child(2)"));

        WebElement america = wd.findElement(By.cssSelector("#country-table tr:first-child td:last-child"));
        WebElement americaU = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:last-child"));
        WebElement americaC = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:last-child"));
        WebElement americaM = wd.findElement(By.cssSelector("#country-table tr:last-child td:last-child"));

        WebElement red = wd.findElement(By.cssSelector("#alert"));
        WebElement red1 = wd.findElement(By.cssSelector("#alert p:first-child"));
        WebElement red2 = wd.findElement(By.cssSelector(".message"));
        WebElement red3 = wd.findElement(By.cssSelector("div#alert"));

    }

}
