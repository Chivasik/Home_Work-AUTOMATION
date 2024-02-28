package Home_Work2;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class HomeWork2 {

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = DriverSetUp.setUpDriver();
//        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
//
//        WebElement carsWebElement = driver.findElement(By.id("Carlist"));
//        WebElement coutryWebElement = driver.findElement(By.name("FromLB"));
//        WebElement countrySecondList = driver.findElement(By.name("ToLB"));
//
//        Select countryListSecond = new Select(driver.findElement(By.name("ToLB")));
//        Select cars = new Select(carsWebElement);
//        cars.selectByVisibleText("Renault");
//
//        Select countryList = new Select(driver.findElement(By.name("FromLB")));
//        countryList.selectByVisibleText("France");
//        Thread.sleep(1000);
//        countryList.selectByVisibleText("Germany");
//        Thread.sleep(1000);
//        countryList.selectByVisibleText("Italy");
//        Thread.sleep(1000);
//        countryList.selectByVisibleText("Malaysia");
//        Thread.sleep(1000);
//        countryList.deselectByValue("Malaysia");
//        Thread.sleep(1000);
//        countryList.selectByVisibleText("Spain");
//        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]"))
//                .click();
//
//        List<WebElement> carsOptionList = cars.getOptions();
//        System.out.println("Автомобили доступные для выбора:");
//        for(WebElement singleCar: carsOptionList){
//            System.out.print(singleCar.getText() + ", ");
//        }
//        System.out.println();
//
//        List<WebElement> countryOptionList = countryList.getOptions();
//        System.out.println("Страны из первой таблицы:");
//        for(WebElement singleCountry: countryOptionList){
//            System.out.print(singleCountry.getText() + ", ");
//        }
//
//        System.out.println();
//
//        List<WebElement> countrySecondOptionalList = countryListSecond.getOptions();
//        System.out.println("Страны из второй таблицы:");
//        for(WebElement singleCountrySecondList: countrySecondOptionalList){
//            System.out.print(singleCountrySecondList.getText() + ", ");
//        }
//
//
//        2) https://demo.guru99.com/test/drag_drop.html
//        Написать программу, которая будет автоматизировать сценарий показанный на видео “Сценарий для автоматизии.mov”.
//        После выполнения сценария на видео вывести в консоль теуст кнопки “Perfect!”

        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
        WebElement toElement = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));

        Actions builder = new Actions(driver);
        Actions dragAndDrop = builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement);
        dragAndDrop.perform();

        WebElement fromSecondElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]"));
        WebElement toSecondElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol"));

        Actions dragAndDrop2 = builder.clickAndHold(fromSecondElement).moveToElement(toSecondElement).release(toSecondElement);
        dragAndDrop2.perform();

        WebElement fromThirdElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
        WebElement toThirdElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol"));

        Actions dragAndDrop3 = builder.clickAndHold(fromThirdElement).moveToElement(toThirdElement).release(toThirdElement);
        dragAndDrop3.perform();


        WebElement fromFourElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
        WebElement toFourElement = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol"));

        Actions dragAndDrop4 = builder.clickAndHold(fromFourElement).moveToElement(toFourElement).release(toFourElement);
        dragAndDrop4.perform();

        String textFromElement = driver.findElement(By.cssSelector(".button.button-green")).getText();

        System.out.println(textFromElement);

        driver.quit();
    }
}
