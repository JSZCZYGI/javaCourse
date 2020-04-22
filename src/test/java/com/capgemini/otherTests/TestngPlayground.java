package com.capgemini.otherTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestngPlayground {

    @Test(description = "This is my test which verifies first test", enabled = false)
    public void firstTest() {
        System.out.println("Does it work?");

        int tested = 1;
        int expected = 2;

        assertThat(tested).
                isEqualTo(expected);
    }


    //region DataProvider
    @DataProvider(name = "test-data")
    public Object[][] createData() {
        return new Object[][]{
                {"Data1", "1"},
                {"Data2", "2"},
                {"Data3", "3"}
        };
    }

    @Test(dataProvider = "test-data")
    public void testWithDataProvider()
    {

    }
    //endregion

}
