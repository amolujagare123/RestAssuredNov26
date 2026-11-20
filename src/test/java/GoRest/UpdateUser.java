package GoRest;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class UpdateUser {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://gorest.co.in/";

        given().log().all()
                //.contentType("application/json")
                .header("Content-Type","application/json")
                .auth().oauth2("gorest_fTId5gH6j2zDq3ws0nmDAUKTgNWuYTuARYaNknMLHYq4B06Af")
                .body("{\n" +
                        "  \"name\": \"shruti\",\n" +
                        "  \"email\": \"shruti.t@gmail.com\",\n" +
                        "  \"status\": \"inactive\"\n" +
                        "}")
                .when().patch("/public/v3/users/01a1f6be-0d88-7430-bb27-3428cade8b4e")
                .then().log().all().statusCode(200);

    }
}
