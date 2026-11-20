package DeckOfCards;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class ShuffleCards2 {

    public static void main(String[] args) {

        RestAssured.baseURI ="https://deckofcardsapi.com/";

        String respStr = given().log().all().queryParam("deck_count", "1")
                .when().get("/api/deck/new/shuffle")
                .then().log().all().statusCode(200).extract().asString();


        System.out.println("respStr="+respStr);

        JsonPath jsonPath = new JsonPath(respStr);

      /*  boolean success = jsonPath.get("success");
        String deckId = jsonPath.get("deck_id");
        int remaining = jsonPath.get("remaining");
        boolean shuffled = jsonPath.get("shuffled");*/


        boolean success = jsonPath.getBoolean("success");
        String deckId = jsonPath.getString("deck_id");
        int remaining = jsonPath.getInt("remaining");
        boolean shuffled = jsonPath.getBoolean("shuffled");

        System.out.println("success="+success);
        System.out.println("deckId="+deckId);
        System.out.println("remaining="+remaining);
        System.out.println("shuffled="+shuffled);

    }

}
