package payload.GoRest;

public class CreateUpdateUser {


    public static String getUser()
    {
        return "{\n" +
                "  \"name\": \"shruti\",\n" +
                "  \"email\": \"shruti123@gmail.com\",\n" +
                "  \"status\": \"active\"\n" +
                "}";
    }

    public static String getUser(String name,String email,String status)
    {
        return "{\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"status\": \""+status+"\"\n" +
                "}";
    }
}
