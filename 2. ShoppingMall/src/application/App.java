package application;

import shoppingmall.MyShop;

public class App {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("11번가"); //샵의 제목
		myshop.genProduct(); //상품생성
		myshop.setExistingUsers("drv98","1234"); //기존회원 생성
		myshop.setExistingUsers("pengsu","5678");//기존회원 생성
		myshop.initAlarm();  //메뉴선택
	}

}
