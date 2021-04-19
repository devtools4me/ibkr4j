package me.devtools4.ibkr4j.rest.session;

import feign.RequestLine;
import java.util.List;

public interface SessionApi {
  @RequestLine("POST /tickle")
  String tickle();

  @RequestLine("POST /logout")
  Logout logout();

  @RequestLine("POST /iserver/auth/status")
  List<AuthStatus> authStatus();

  @RequestLine("POST /iserver/reauthenticate")
  List<AuthStatus> reauthenticate();

  @RequestLine("GET /sso/validate")
  SsoValidate ssoValidate();
}