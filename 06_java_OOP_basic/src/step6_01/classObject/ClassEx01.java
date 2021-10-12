package step6_01.classObject;

/*
 * 
 * # 클래스 
 * 
 * 1. 정의 ( 설계도 )
 * 
 * 		1-1) class : 키워드
 * 		1-2) Ex01  : 클래스명 ( 첫글자를 대문자로 작성한다. ) 
 * 		1-3) {}    : 클래스의 영역 
 * 
 * 2. 선언 ( 실 체 )
 * 	
 * 		클래스명 변수명 = new 클래스명();
 *    	ex)  Ex01   e   =  new Ex01();
 *    	  Random ran    =  new Random();
 * 
 * */

class Character {
	
	int level = 1;  // 멤버변수(멤버) , 필드 
	int power = 10;
	int dex   = 10;
	int life  = 10;
	int mana  = 10;
	
}

public class ClassEx01 {

	public static void main(String[] args) {

		Character c1 = new Character();
		
		System.out.println(c1);   // 주소
		System.out.println(c1.level);
		System.out.println(c1.power);
		System.out.println(c1.dex);
		System.out.println(c1.life);
		System.out.println(c1.mana);
		System.out.println();
		
		Character c2 = new Character();
		c2.level++;
		c2.power += 10;
		c2.dex += 5;
		
		System.out.println(c2);
		System.out.println(c2.level);
		System.out.println(c2.power);
		System.out.println(c2.dex);
		System.out.println(c2.life);
		System.out.println(c2.mana);
		
	}

}
