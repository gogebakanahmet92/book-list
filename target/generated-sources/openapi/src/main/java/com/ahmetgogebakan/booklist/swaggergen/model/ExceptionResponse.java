package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
import com.ahmetgogebakan.booklist.swaggergen.model.Error;
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

public class ExceptionResponse implements Serializable {
        @Schema(example = "19-09-2020 16:58:36", description = "", pattern = "DD-MM-YYYY HH:MI:SS", enumAsRef = true)
        @JsonProperty("timestamp")
    private String timestamp;

        @Schema(example = "", description = "", pattern = "", enumAsRef = true)
        @JsonProperty("result")
    private Result result;

        @Schema(example = "", description = "", pattern = "", enumAsRef = true)
        @JsonProperty("error")
    private Error error;



public String getTimestamp() {
return timestamp;
}

public void setTimestamp(String timestamp) {
this.timestamp = timestamp;
}


    @ApiModelProperty(required = true)
    @NotNull(message="ExceptionResponse.result.notNull")

public Result getResult() {
return result;
}

public void setResult(Result result) {
this.result = result;
}



public Error getError() {
return error;
}

public void setError(Error error) {
this.error = error;
}

@Override
public String toString() {
return "ExceptionResponse{" +
", timestamp=" + timestamp +
", result=" + result +
", error=" + error +
"}";
}
}
