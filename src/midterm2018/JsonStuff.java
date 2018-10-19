package midterm2018;
import com.google.gson.*;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;

public class JsonStuff {

    /*public JsonStuff(String S)
    {

    }*/

    public static void main(String [] arg)
    {
        int z = 0;
        String question3 = "{\n"
                + "    “task” : “inc”,\n"
                + "    “num” : 3\n"
                + "}\n";

        Gson gson = new Gson();
        String s = gson.toJson(question3, String.class);
        System.out.println(gson.toJson(question3));
        JsonParser jsonParser = new JsonParser();
        JsonObject obj = (JsonObject) jsonParser.parse(question3).getAsJsonObject();
        int i = gson.fromJson(obj.get("3"),int.class);
        //i = gson.fromJson(obj.get("“num”"), int.class);
        System.out.println(i);
        //JsonObject json = new JsonObject();
/*
        */
    }
}
