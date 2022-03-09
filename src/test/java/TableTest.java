import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void xPathTests(){

        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/ja321/Downloads/index.html");
        wd.manage().window().maximize();

        WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));
        String textItem1 = item1.getText();
        System.out.println("Text of element Item1 --->"+textItem1);
        Assert.assertEquals(textItem1,"Item 1");

        WebElement item2 = wd.findElement(By.xpath("//a[@href='#item2']"));
        String textItem2 = item2.getText();
        System.out.printf("Text of element Item2 --->" +textItem2);
        Assert.assertEquals(textItem2,"Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[@href='#item3']"));
        String textItem3 = item3.getText();
        System.out.printf("Text of element Item3--->" +textItem3);
        Assert.assertEquals(textItem3,"Item 3");

        WebElement item4 = wd.findElement(By.xpath("//a[@href='#item4']"));
        String textItem4 = item4.getText();
        System.out.printf("Text of element Item4--->"+textItem4);
        Assert.assertEquals(textItem4,"Item 4");

        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope,"Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia =asia.getText();
        Assert.assertEquals(textAsia,"Asia");

        WebElement america = wd.findElement(By.xpath("//*[text()='America']"));
        String textAmerica =america.getText();
        Assert.assertEquals(textAmerica,"America");

        WebElement ukraine =wd.findElement(By.xpath("//*[text()='Ukraine']"));
        String textUkraine = ukraine.getText();
        Assert.assertEquals(textUkraine,"Ukraine");

        WebElement israel = wd.findElement(By.xpath("//*[text()='Israel']"));
        String textIsrael =israel.getText();
        Assert.assertEquals(textIsrael,"Israel");

        WebElement usa = wd.findElement(By.xpath("//*[text()='USA']"));
        String textUsa = usa.getText();
        Assert.assertEquals(textUsa,"USA");

        WebElement germany = wd.findElement(By.xpath("//*[text()='Germany']"));
        String textGermany = germany.getText();
        Assert.assertEquals(textGermany,"Germany");

        WebElement russia = wd.findElement(By.xpath("//*[text()='Russia']"));
        String textRussia = russia.getText();
        Assert.assertEquals(textRussia,"Russia");

        WebElement canada = wd.findElement(By.xpath("//*[text()='Canada']"));
        String textCanada = canada.getText();
        Assert.assertEquals(textCanada,"Canada");

        WebElement poland = wd.findElement(By.xpath("//*[text()='Poland']"));
        String textPoland = poland.getText();
        Assert.assertEquals(textPoland,"Poland");

        WebElement chine = wd.findElement(By.xpath("//*[text()='Chine']"));
        String textChine = chine.getText();
        Assert.assertEquals(textChine,"Chine");

        WebElement mexico = wd.findElement(By.xpath("//*[text()='Mexico']"));
        String textMexico = mexico.getText();
        Assert.assertEquals(textMexico,"Mexico");


        item1.click();
        WebElement message1 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage1 = message1.getText();
        Assert.assertEquals(textMessage1,"Clicked by Item 1");

        item2.click();
        WebElement message2 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage2 = message2.getText();
        Assert.assertEquals(textMessage2,"Clicked by Item 2");

        item3.click();
        WebElement message3 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage3 = message3.getText();
        Assert.assertEquals(textMessage3,"Clicked by Item 3");

        item4.click();
        WebElement message4 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage4 = message4.getText();
        Assert.assertEquals(textMessage4,"Clicked by Item 4");
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
