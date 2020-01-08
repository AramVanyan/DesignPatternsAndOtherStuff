package serialization_and_deserialization.json;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.UnknownServiceException;

public class Main {
    public static void main(String[] args) {
        String json = serializeUserSimple();
        System.out.println(json);
        UserSimple user = deserializeUserSimple(json);
        System.out.println(user);
    }
    private static String serializeUserSimple(){
        UserSimple user = new UserSimple(
                "Vardan",
                "vardan.ohanyan@gmail.com",
                19,
                false);
        Gson gson = new Gson();
        return gson.toJson(user);

    }
    private static UserSimple deserializeUserSimple(String json){
        String userJson = json;
        Gson gson = new Gson();
        UserSimple userSimple = null;
        try {
            userSimple = gson.fromJson(new JsonReader(new FileReader("/UserSimple.json")),UserSimple.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userSimple;
    }
}
