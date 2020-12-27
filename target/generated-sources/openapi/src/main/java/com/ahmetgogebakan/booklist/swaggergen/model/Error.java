package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
import com.ahmetgogebakan.booklist.swaggergen.model.ErrorType;
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

public class Error implements Serializable {
        @Schema(example = "300041", description = "Unique identifier of the error message", pattern = "", enumAsRef = true)
        @JsonProperty("errorId")
    private Integer errorId;

        @Schema(example = "Incorrect Login, Password.", description = "Description of the error message", pattern = "", enumAsRef = true)
        @JsonProperty("errorMessage")
    private String errorMessage;

        @Schema(example = "", description = "", pattern = "", enumAsRef = true)
        @JsonProperty("errorType")
    private ErrorType errorType;



public Integer getErrorId() {
return errorId;
}

public void setErrorId(Integer errorId) {
this.errorId = errorId;
}



public String getErrorMessage() {
return errorMessage;
}

public void setErrorMessage(String errorMessage) {
this.errorMessage = errorMessage;
}



public ErrorType getErrorType() {
return errorType;
}

public void setErrorType(ErrorType errorType) {
this.errorType = errorType;
}

@Override
public String toString() {
return "Error{" +
", errorId=" + errorId +
", errorMessage=" + errorMessage +
", errorType=" + errorType +
"}";
}
}
