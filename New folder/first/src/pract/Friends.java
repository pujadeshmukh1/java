package pract;

public class Friends {
	String name;
	int number;
	String address;
//	parameteries constructor
	public Friends (String name,int number,String address) {
		this.address=address;
		this.name=name;
		this.number=number;
	}
//	java bean
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public static void main(String[] args) {
		Friends fri = new Friends("akshay",1111111,"hfdhsudf");
		
	}
}
