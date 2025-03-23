package api.utilities;

import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider(name="Data")
    public static Iterator<Object[]> getAllData() throws IOException
    {
        String path=System.getProperty("user.dir")+"//TestData//Userdata.xlsx";
        XLUtility xl=new XLUtility(path);

        int rownum=xl.getRowCount("Sheet1");
        int colcount=xl.getCellCount("Sheet1",1);

        List<Object[]> apidata =new ArrayList<>();

        for(int i=1;i<=rownum;i++)
        {
            Object[] rowData = new Object[colcount];
            for(int j=0;j<colcount;j++) {
                rowData[j] = xl.getCellData("Sheet1", i, j);
            }
//          apidata.add(rowData);
            }
        return apidata.iterator();
    }

    @DataProvider(name="UserNames")
    public static Object[][] getUserNames() throws IOException
    {
        String path=System.getProperty("user.dir")+"//TestData//Userdata.xlsx";
        XLUtility xl=new XLUtility(path);

        int rownum=xl.getRowCount("Sheet1");

        Object[][] apidata = new Object[rownum][1];

        for(int i=1;i<=rownum;i++)
        {
            apidata[i-1][0]= xl.getCellData("Sheet1",i, 1);
        }

        return apidata;
    }

}