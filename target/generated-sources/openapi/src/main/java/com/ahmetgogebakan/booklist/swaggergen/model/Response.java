package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
import com.ahmetgogebakan.booklist.swaggergen.model.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
    import java.io.Serializable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

            import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-27T02:04:12.306597+03:00[Europe/Istanbul]")

public class Response implements Serializable {
        @Schema(example = "", description = "", pattern = "", enumAsRef = true)
        @JsonProperty("result")
    private Result result;

        @Schema(example = "Your transaction has been completed", description = "Result message", pattern = "", enumAsRef = true)
        @JsonProperty("message")
    private String message;

        @Schema(example = "2600000015131111", description = "Unique identifier of the user session", pattern = "", enumAsRef = true)
        @JsonProperty("sessionId")
    private String sessionId;


    @ApiModelProperty(required = true)
    @NotNull(message="Response.result.notNull")

public Result getResult() {
return result;
}

public void setResult(Result result) {
this.result = result;
}



public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}



public String getSessionId() {
return sessionId;
}

public void setSessionId(String sessionId) {
this.sessionId = sessionId;
}

@Override
public String toString() {
return "Response{" +
", result=" + result +
", message=" + message +
", sessionId=" + sessionId +
"}";
}
}
