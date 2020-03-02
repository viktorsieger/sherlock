package se.umu.cs;

import com.google.gson.*;
import se.umu.cs.githubtypes.Organization;
import se.umu.cs.githubtypes.Repository;
import se.umu.cs.githubtypes.RepositoryOwner;
import se.umu.cs.githubtypes.User;

import java.lang.reflect.Type;

public class JsonUtils {

    private static JsonDeserializer<RepositoryOwner> deserializerRepositoryOwner = (jsonElement, type, jsonDeserializationContext) -> {

        if(!jsonElement.isJsonObject()) {
            throw new JsonParseException("jsonElement is not a JsonObject");
        }

        JsonObject jsonObject = jsonElement.getAsJsonObject();

        if(!jsonObject.has("__typename")) {
            throw new JsonParseException("jsonObject has no \"__typename\" field");
        }

        String typename = jsonObject.getAsJsonPrimitive("__typename").getAsString();

        if(typename.equals("Organization")) {
            return (new Gson()).fromJson(jsonObject, Organization.class);
        }
        else if(typename.equals("User")) {
            return (new Gson()).fromJson(jsonObject, User.class);
        }

        return null;
    };

    public static Repository parseJsonComprisingRepository(String json) throws JsonParseException {

        JsonElement parseTree = JsonParser.parseString(json);

        if(!parseTree.isJsonObject()) {
            throw new JsonParseException("parseTree is not a JsonObject");
        }

        JsonObject parseTreeJsonObject = parseTree.getAsJsonObject();

        if(!parseTreeJsonObject.has("data")) {
            throw new JsonParseException("parseTreeObject has no \"data\" field");
        }

        JsonObject data = parseTreeJsonObject.getAsJsonObject("data");

        if(!data.has("repository")) {
            throw new JsonParseException("data has no \"repository\" field");
        }

        JsonObject repository = data.getAsJsonObject("repository");

        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(RepositoryOwner.class, deserializerRepositoryOwner);

        Gson gson = gsonBuilder.create();

        return gson.fromJson(repository.toString(), Repository.class);
    }
}
