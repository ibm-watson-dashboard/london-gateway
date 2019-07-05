package br.com.lepsistemas.londongateway.spring.security;

import org.springframework.beans.factory.annotation.Value;

public class JwtConfig {
	
	@Value("${security.jwt.uri:/auth/**}")
	private String auth;
	
	@Value("${security.jwt.uri:/oauth2/**}")
	private String oauth2;
	
	@Value("${security.jwt.header:Authorization}")
	private String header;
	
	@Value("${security.jwt.prefix:Bearer }")
	private String prefix;
	
	@Value("${security.jwt.expiration:#{24*60*60}}")
	private long expiration;
	
	@Value("${security.jwt.secret:926D96C90030DD58429D2751AC1BDBBC}")
	private String secret;

	public String getAuth() {
		return auth;
	}

	public String getOauth2() {
		return oauth2;
	}

	public String getHeader() {
		return header;
	}

	public String getPrefix() {
		return prefix;
	}

	public long getExpiration() {
		return expiration;
	}

	public String getSecret() {
		return secret;
	}

}
