package com.ahmetgogebakan.booklist.swaggergen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
    import java.io.Serializable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

            import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ErrorType
 */
public enum ErrorType {
  
  CORE_ERROR("CORE_ERROR"),
  
  MIDDLEWARE_ERROR("MIDDLEWARE_ERROR"),
  
  AUTHENTICATION_ERROR("AUTHENTICATION_ERROR");

  private String value;

  ErrorType(String value) {
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
  public static ErrorType fromValue(String value) {
    for (ErrorType b : ErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

