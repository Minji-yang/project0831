	package project0831;
	class insa{
		private String no;
		private String name;
		private String address;
		private String hp;
		private int sum;
		
		public int getSum() {
			return sum;
		}
	
		public void setSum(int sum) {
			this.sum = sum;
		}
	
		insa(){
			System.out.println("생성자 호출");
		}
		
		insa(String no){
			this.no=no;
			}
		
		insa(String no, String name){
			this.no=no;
			this.name=name;
		}
		void print() {
			System.out.printf("사번 : %s    이름 : %s\n",no,name);
			System.out.printf("주소 : %s     전화번호 : %s\n",address,hp);
		}
	
		public String getNo() {
			return no;
		}
	
		public void setNo(String no) {
			this.no = no;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getAddress() {
			return address;
		}
	
		public void setAddress(String address) {
			this.address = address;
		}
	
		public String getHp() {
			return hp;
		}
	
		public void setHp(String hp) {
			this.hp = hp;
		}
	}
	public class Exam03 {
	
		public static void main(String[] args) {
			insa in1= new insa();
			 in1.setNo("20210001");
			  in1.setName("홍길동");
			  in1.setAddress("부산시 부산진구 양정동");
			  in1.setHp("010-1111-1111");
			  in1.print();
			System.out.println(in1.getNo());
			  
			insa in2= new insa();
			 in2.setNo("20210002");
			  in2.setName("이순신");
			  in2.setAddress("부산시 금정구 장전동");
			  in2.setHp("010-2222-222");
			  in2.print();
			
			insa in3	= new insa();
			 in3.setNo("20210003");
			  in3.setName("강감찬");
			  in3.setAddress("부산시 해운대구 우동");
			  in3.setHp("010-3333-3333");
			  in3.print();
			
			  
			  insa in4=new insa("20220001");
			  in4.print();
	
			  insa in5=new insa("20220002","이이");
			  in5.print();
			  		 
			  System.out.println(in4.getSum());
		}
	
	}
