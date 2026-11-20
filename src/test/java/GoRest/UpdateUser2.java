package GoRest;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static payload.GoRest.CreateUpdateUser.getUser;

public class UpdateUser2 {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://gorest.co.in/";

        given().log().all()
                //.contentType("application/json")
                .header("Content-Type","application/json")
                .auth().oauth2("gorest_fTId5gH6j2zDq3ws0nmDAUKTgNWuYTuARYaNknMLHYq4B06Af")
                .body(getUser("Diptarup","diptarup123@gmail.com","inactive"))
                .when().patch("/public/v3/users/01a1f6cb-4334-7efa-9b2c-30a3ddbf04cb")
                .then().log().all().statusCode(200);

    }
}
