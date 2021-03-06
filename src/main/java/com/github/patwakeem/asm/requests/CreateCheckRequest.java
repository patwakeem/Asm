package com.github.patwakeem.asm.requests;

import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.plainobjects.CreateCheckBody;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

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
