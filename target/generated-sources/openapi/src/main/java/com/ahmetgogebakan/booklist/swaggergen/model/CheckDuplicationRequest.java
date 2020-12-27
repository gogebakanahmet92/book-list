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

public class CheckDuplicationRequest implements Serializable {
        @Schema(example = "Ahmet", description = "Customer name", pattern = "", enumAsRef = true)
        @JsonProperty("name")
    private String name;

        @Schema(example = "Gogebakan", description = "Customer surname", pattern = "", enumAsRef = true)
        @JsonProperty("surname")
    private String surname;

        @Schema(example = "1234567890123", description = "Customer cnp", pattern = "", enumAsRef = true)
        @JsonProperty("cnp")
    private String cnp;



public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}



public String getSurname() {
return surname;
}

public void setSurname(String surname) {
this.surname = surname;
}



public String getCnp() {
return cnp;
}

public void setCnp(String cnp) {
this.cnp = cnp;
}

@Override
public String toString() {
return "CheckDuplicationRequest{" +
", name=" + name +
", surname=" + surname +
", cnp=" + cnp +
"}";
}
}
