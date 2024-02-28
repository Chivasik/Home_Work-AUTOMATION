package Home_Work1;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {
//    Написать программу, которая будет открывать четыри различных страниц в новых окнах:
//    https://zoo.kiev.ua/
//    https://www.w3schools.com/
//    https://taxi838.ua/ru/dnepr/
//    https://klopotenko.com/
//    Прописать цикл, который будет переключаться поочередно через все страницы,
//    для каждой страницы выводить в консоль название и ссылку на эту страницу.
//    И будет закрывать ту страницу в названии которой есть слово зоопарк.
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverSetUp.setUpDriver();
        //WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button"));

        //driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");

        driver.get("http://www.automationpractice.pl/index.php");

        //WebElement element = driver.findElement(By.xpath("/html/body/div[1]/footer"));

//        ArrayList<String> pages = new ArrayList<>();
//        pages.add("https://www.w3schools.com/");
//        pages.add("https://taxi838.ua/ru/dnepr/");
//        pages.add("https://klopotenko.com/");
//        pages.add("https://zoo.kiev.ua/");
//
//        try{
//            for(String page: pages){
//                driver.get(page);
//                System.out.println(driver.getTitle());
//                System.out.println(driver.getCurrentUrl());
//                if(driver.getTitle().toLowerCase().contains("зоопарк")){
//                    System.out.println("Close page: " + driver.getTitle());
//                    driver.close();
//                }
//            }
//        }catch (Exception ex){
//            System.out.println("Message " + ex.getMessage());
//        }finally {
//            driver.quit();
//        }

//        Написать метод в параметры которого принимаются два ВебЭлемента.
//        метод выводит в консоль информацию какой из двух элементов располагается выше на странице,
//        какой из элементов располагается левее на странице,
//        а также какой из элементов занимает большую площадь.
//        Параметры метода могут также включать в себя другие аргументы, если это необходимо.

        //WebElement element1 = driver.findElement(By.cssSelector(".blue.active"));
        //WebElement element2 = driver.findElement(By.cssSelector(".buttons-holder.block.block-4-12"));

        //System.out.println(element1);
        //System.out.println(element2);
        //printElementPosition(element1, element2);

        //printElem(driver, element);

        task4(driver);
        driver.quit();
    }

//    public static void printElementPosition(WebElement element1, WebElement element2){
//        int element1X = element1.getLocation().getX();
//        int element1Y = element1.getLocation().getY();
//        int element2X = element2.getLocation().getX();
//        int element2Y = element2.getLocation().getY();
//
//        String aboveElement = (element1Y < element2Y) ? "Элемент 1" : "Элемент 2";
//        System.out.println(aboveElement + " располагается выше на странице.");
//
//        String leftElement = (element1X < element2X) ? "Элемент 1" : "Элемент 2";
//        System.out.println(leftElement + " располагается левее на странице.");
//
//        int element1Area = element1.getSize().getHeight() * element1.getSize().getWidth();
//        int element2Area = element2.getSize().getHeight() * element2.getSize().getWidth();
//        String largerElement = (element1Area > element2Area) ? "Элемент 1" : "Элемент 2";
//        System.out.println(largerElement + " занимает большую площадь.");
//
//
//    }

//    public static void printElem(WebDriver driver, WebElement element){
//        //    Написать метод который выводит сообщение об айди элемента,
////    значении тэга элемента , значении класса элемента,
////    значении атрибута name элемента, текста данного элемента,
////    а также о координатах центра контейнера данного элемента.
//
//        String elementId = element.getAttribute("id");
//        String tagName = element.getTagName();
//        String className = element.getAttribute("class");
//        String nameAttribute = element.getAttribute("name");
//        String text = element.getText();
//        int centerX = element.getLocation().getX() + element.getSize().getWidth() / 2;
//        int centerY = element.getLocation().getY() + element.getSize().getHeight() / 2;
//
//        // Выводим информацию о элементе
//        System.out.println("ID : " + elementId);
//        System.out.println("Тэг : " + tagName);
//        System.out.println("Класс : " + className);
//        System.out.println("Значение атрибута name : " + nameAttribute);
//        System.out.println("Текст элемента : " + text);
//        System.out.println("Координаты центра контейнера : " + centerX + ", " + centerY);
//
//    }


//    Написать программу, которая повторит действия на видео “HW_AUTOMATION_LESSON_3_UPDATE.mp4”.
//    http://www.automationpractice.pl/index.php

    public static void task4(WebDriver driver) throws InterruptedException {
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]"))
                 .sendKeys("Printed Chiffon Dress");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]"))
                .sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Printed Chiffon Dress")).sendKeys(Keys.ENTER);

        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
        driver.navigate().refresh();
        driver.findElement(By.id("add_to_cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]"))
                .sendKeys("Faded Short");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")).click();
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("L");
        driver.navigate().refresh();
        driver.findElement(By.id("add_to_cart")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
        Thread.sleep(4000);


    }



}
