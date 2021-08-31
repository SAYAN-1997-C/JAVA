package CollectionsFramework;

public class Laptop implements Comparable<Laptop> {
	
	String brand;
	int ram;
	int price;
	
	Laptop(String brand,int ram,int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getRam() {
		return ram;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [ Brand : "+this.brand+" Ram : "+this.ram+" Price : "+this.price;
	}
	@Override
	public int compareTo(Laptop lap1) {
		// TODO Auto-generated method stub
		if(this.getRam()>lap1.getRam())
			return 1;
		else 
			return -1;
	}
	
	

}
