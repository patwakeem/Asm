package requests;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import plainobjects.CheckType;
import plainobjects.CreateCheckBody;

@Getter
@AllArgsConstructor
public class CreateCheckRequest {

    private CheckType checkType;
    private CreateCheckBody createCheckBody;

    public String getCheckTypeAsString() {
        return checkType.toString();
    }

    public JsonObject getBody() {
        return createCheckBody.getJson();
    }
}
