package com.varxyzbanking.domain;

public class OverChargeException extends RuntimeException {
	public OverChargeException(String msg) {
		super(msg);
	}
}
