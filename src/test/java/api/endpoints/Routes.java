package api.endpoints;


import org.apache.xpath.operations.String;

/*
Swagger URL :     https://petstore.swagger.io
Create User [POST] : https://petstore.swagger.io/v2/user
Read /Get User [Get] : https://petstore.swagger.io/v2/user/{username}
Update User [Put]: https://petstore.swagger.io/v2/user/{username}
Delete User [Delete]:  https://petstore.swagger.io/v2/user/{username}


*/
public class Routes {

    public static java.lang.String base_url = "https://petstore.swagger.io/v2";

    //USER MODEL

    public static java.lang.String post_url = base_url + "/user";

    public static java.lang.String get_url = base_url + "/user";

   // public static java.lang.String post_url = base_url + "/user";

    //public static java.lang.String post_url = base_url + "/user";

}
