package DeckOfCards;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class DrawCards {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://deckofcardsapi.com/";

        given().log().all().queryParam("count","2")
                .when().get("/api/deck/13n06hf19z9z/draw/")
                .then().log().all().statusCode(200);


    }
}
