package PractisetestNG;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    public void createContact(){
        System.out.println("execute create contact");
    }

    @Test(priority = 2)
    public void modifyContact(){
        System.out.println("execute modify contact");
    }

    @Test(priority = 3)
    public void deleteContact(){
        System.out.println("execute delete contact");
    }

}
