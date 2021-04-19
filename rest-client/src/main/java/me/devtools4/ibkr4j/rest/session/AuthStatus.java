package me.devtools4.ibkr4j.rest.session;

import com.dslplatform.json.CompiledJson;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@CompiledJson
public class AuthStatus {
  Boolean authenticated;
  Boolean connected;
  Boolean competing;
  String fail;
  String message;
  List<String> prompts;
}