package GoRest;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GetAllUsers {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://gorest.co.in/";

        given().log().all().queryParam("page","10")
                .auth().oauth2("gorest_fTId5gH6j2zDq3ws0nmDAUKTgNWuYTuARYaNknMLHYq4B06Af")
                .when().get("/public/v3/users")
                .then().log().all().statusCode(200);
    }
}
