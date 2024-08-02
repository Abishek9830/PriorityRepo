package PractisetestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "getData")
    public void createContact(String fn, String ln){
        System.out.println(fn+" "+ln);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] oArr = new Object[2][2];
        oArr[0][0]="Abishek";
        oArr[0][1]="RV";
        oArr[1][0]="Puppy";
        oArr[1][1]="Abi";
        return oArr;
    }


}
