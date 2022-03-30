package com.Online.MovieTicketBooking.model;

public class JwtToken {
private final String jwt;

public String getJwt() {
	return jwt;
}

public JwtToken(String jwt) {
	super();
	this.jwt = jwt;
}

}
