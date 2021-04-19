package me.devtools4.ibkr4j.rest.session;

import com.dslplatform.json.CompiledJson;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@CompiledJson
public class SsoValidate {
  Integer LOGIN_TYPE;
  String USER_NAME;
  Integer USER_ID;
  Integer expire;
  Boolean RESULT;
  Integer AUTH_TIME;
}