package com.example.service.pojo;

import javax.validation.constraints.NotNull;

public class Hello {

	@NotNull
	private String same;

	public String getSame() {
		return same;
	}

	public void setSame(String same) {
		this.same = same;
	}

	
}
