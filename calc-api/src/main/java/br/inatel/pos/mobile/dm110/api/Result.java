package br.inatel.pos.mobile.dm110.api;


public class Result {
	
	private String first;
	private String second;
	public void setSecond(String second) {
		this.second = second;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	private String result;
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
}
