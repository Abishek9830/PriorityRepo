package PractisetestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependsOnMtdEx {
    @Test
    public void createContact(){
        System.out.println("execute create contact");
    }

    @Test(dependsOnMethods = "createContact")
    public void modifyContact(){
        System.out.println("execute modify contact");
    }

    @Test(dependsOnMethods = "modifyContact")
    public void deleteContact(){
        System.out.println("execute delete contact");
    }

}
