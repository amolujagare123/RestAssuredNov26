package GoRest;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class CreateUSer {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://gorest.co.in/";

        given().log().all()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"name\": \"shruti\",\n" +
                        "  \"email\": \"shruti123@gmail.com\",\n" +
                        "  \"status\": \"active\"\n" +
                        "}")

                .auth().oauth2("gorest_fTId5gH6j2zDq3ws0nmDAUKTgNWuYTuARYaNknMLHYq4B06Af")
                .when().post("/public/v3/users")
                .then().log().all().statusCode(201);
    }
}
