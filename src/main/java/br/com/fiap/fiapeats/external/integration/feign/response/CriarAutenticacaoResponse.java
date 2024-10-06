package br.com.fiap.fiapeats.external.integration.feign.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarAutenticacaoResponse {

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("token_type")
  private String tokenType;

  public CriarAutenticacaoResponse(String accessToken, String tokenType) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public String getTokenType() {
    return tokenType;
  }
}
