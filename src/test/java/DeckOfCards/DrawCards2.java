package DeckOfCards;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class DrawCards2 {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://deckofcardsapi.com/";

        String respStr = given().log().all().queryParam("count", "2")
                .when().get("/api/deck/13n06hf19z9z/draw/")
                .then().log().all().statusCode(200).extract().asString();

        System.out.println("respStr="+respStr);

        JsonPath jsonPath = new JsonPath(respStr);

        int size = jsonPath.get("cards.size()");

        System.out.println("size="+size);

        String code0 = jsonPath.get("cards[0].code");
        System.out.println("code0="+code0);


        String code1 = jsonPath.get("cards[1].code");
        System.out.println("code1="+code1);


        String image0 = jsonPath.get("cards[0].images.png");
        System.out.println("image0="+image0);


        String image1 = jsonPath.get("cards[1].images.png");
        System.out.println("image1="+image1);



    }
}
