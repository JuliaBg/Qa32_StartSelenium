import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
    @Test
    public void startPhoneBook(){
        wd = new ChromeDriver();

       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.manage().window().maximize();

      // WebElement el = wd.findElement(By.id("idel"));
      // List<WebElement> list = wd.findElements(By.id("idel"));
      //    WebElement a =  wd.findElement(By.tagName("a"));
        List<WebElement>elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("container"));






       // wd.close();
       // wd.quit();


    }
    @Test
    public  void home(){
        wd = new ChromeDriver();



        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();


        WebElement el = wd.findElement(By.tagName("body"));
        WebElement el1 =  wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.className("active"));
        WebElement el4 = wd.findElement(By.id("root"));
        WebElement el5 =  wd.findElement(By.tagName("h1"));
        WebElement el6 =  wd.findElement(By.tagName("input"));
        WebElement el7 =  wd.findElement(By.tagName("button"));
        WebElement el8 =  wd.findElement(By.tagName("br"));
        WebElement el9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el10 = wd.findElement(By.className("login_login__3EHKB"));

        //By LinkText
        WebElement el11 = wd.findElement(By.linkText("HOME"));
        WebElement el12 = wd.findElement(By.linkText("ABOUT"));
        WebElement el13 = wd.findElement(By.linkText("LOGIN"));

        //By partialLinkText
        WebElement el14 = wd.findElement(By.partialLinkText("HO"));





    }
    @Test
    public void cssLocatorsTest(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        //By tagName
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        //By id
        wd.findElement(By.cssSelector("#root"));
        //By class
        wd.findElement(By.cssSelector(".active"));

        // atribut
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder ='Password']"));
        wd.findElement(By.cssSelector("[placeholder* ='ss']"));
        wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        wd.findElement(By.cssSelector("[placeholder $='rd']"));


    }


}
