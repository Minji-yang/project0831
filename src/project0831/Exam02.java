package project0831;
class Student{
	String num;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	
	void total()  {
		tot=kor+eng+math;
	}
	void average () {
		avg=tot/3.0;
	}
	void print() {
		System.out.printf("학번 : %s,     이름 : %s\n",num,name);
		System.out.printf("국어 : %d,     영어 : %d,        수학:%d\n",kor,eng,math);
		System.out.printf("합계 : %d,     평균 : %.2f\n",tot,avg);
	}
}
public class Exam02 {
	
	public static void main(String[] args) {
		Student st1=new Student();	
		st1.num="20200001";
		st1.name="홍길동";
		st1.kor=90;
		st1.eng=85;
		st1.math=92;
		st1.total();
		st1.average();
		st1.print();
		
		Student st2=new Student();	
		st2.num="20200002";
		st2.name="이순신";
		st2.kor=90;
		st2.eng=85;
		st1.math=92;
		st1.total();
		st1.average();
		st1.print();

	}

}
	