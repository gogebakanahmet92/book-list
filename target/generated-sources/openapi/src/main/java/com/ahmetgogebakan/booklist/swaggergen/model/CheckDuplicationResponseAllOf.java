package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
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

public class CheckDuplicationResponseAllOf implements Serializable {
        @Schema(example = "true", description = "check for duplication", pattern = "", enumAsRef = true)
        @JsonProperty("isDuplicate")
    private Boolean isDuplicate;



public Boolean getIsDuplicate() {
return isDuplicate;
}

public void setIsDuplicate(Boolean isDuplicate) {
this.isDuplicate = isDuplicate;
}

@Override
public String toString() {
return "CheckDuplicationResponseAllOf{" +
", isDuplicate=" + isDuplicate +
"}";
}
}
