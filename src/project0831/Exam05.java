package project0831;
class coffee{
	String model;
	int price;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void print(){System.out.printf("종류 : %s   가격 : %d\n",model,price);
	
}}
public class Exam05 {

	public static void main(String[] args) {
		coffee co1=new coffee();
		co1.setModel("아메리카노");
		co1.setPrice(1500);
		co1.print();
		
		coffee co2=new coffee();
		co2.setModel("바닐라라떼");
		co2.setPrice(3800);
		co2.print();

	}

}
