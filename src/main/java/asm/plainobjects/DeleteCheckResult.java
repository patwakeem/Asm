package asm.plainobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Getter
@AllArgsConstructor
public class DeleteCheckResult implements ResponseWrapper {

    private Response<ResponseBody> rawResponse;

    @Override
    public boolean isSuccessful() {
        return false;
    }
}