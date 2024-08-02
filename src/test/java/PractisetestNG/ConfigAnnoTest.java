package PractisetestNG;

import org.testng.annotations.*;

public class ConfigAnnoTest {
    @BeforeSuite
    public void bS(){
        System.out.println("BEFORE SUITE");
    }

    @AfterSuite
    public void aS(){
        System.out.println("AFTER SUITE");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Execute BC");
    }
    @BeforeMethod
    public void beforeMtd(){
        System.out.println("Execute BM");
    }
    @Test
    public void createContact(){
        System.out.println("Execute create contact");
    }
    @Test
    public void createContact1(){
        System.out.println("Execute create contact 1");
    }
    @AfterMethod
    public void afterMtd(){
        System.out.println("Execute AM");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Execute AC");
    }
}
