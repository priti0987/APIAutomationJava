package api.test;

import api.endpoints.UserEndPoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDtest {


    @Test(priority = 1)
    public  void  testPostUser()
    {
      //  Response response= UserEndPoints.createUser(userPayload);
     //   response.then().log().all();
        //Assert.assertEquals(response.getStatusCode(),200);
    }

}
