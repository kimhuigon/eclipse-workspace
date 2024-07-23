package ch11;

public class SaltyRamen extends Ramen{
	public SaltyRamen(String name) {
		super.name = name;
	}
	
	@Override
	public String getTaste() {
		return "소금 라면 => 짠 라면맛";
	}
}
