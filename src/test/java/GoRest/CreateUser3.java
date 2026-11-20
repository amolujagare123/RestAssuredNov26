package GoRest;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static payload.GoRest.CreateUpdateUser.getUser;

public class CreateUser3 {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://gorest.co.in/";

        given().log().all()
                .header("Content-Type","application/json")
                .body(getUser("Diptarup","diptarup@gmail.com","active"))
                .auth().oauth2("gorest_fTId5gH6j2zDq3ws0nmDAUKTgNWuYTuARYaNknMLHYq4B06Af")
                .when().post("/public/v3/users")
                .then().log().all().statusCode(201);
    }
}
