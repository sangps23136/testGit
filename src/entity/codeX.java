package entity;

public enum codeX {
	soPI("3,14"),
	sortByPointAsc("maAsc"),
	sortByNameAsc("tenAsc");
	
	private String code;
	codeX(String code){this.code=code;};
	public String getCode() {return this.code;}
}
