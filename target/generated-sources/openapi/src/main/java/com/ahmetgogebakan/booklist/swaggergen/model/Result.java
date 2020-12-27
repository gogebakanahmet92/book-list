package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
    import java.io.Serializable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

            import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Result
 */
public enum Result {
  
  OK("OK"),
  
  ERROR("ERROR");

  private String value;

  Result(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Result fromValue(String value) {
    for (Result b : Result.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

