package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

import products.Cloth;
import products.Electronic;
import products.Product;
import products.SportingItem;

public class MyShop {

	// 쇼핑몰 이름
	String title;
	
	// 기존 계정 셋팅(메인 함수에서 변경하기)
	public String[] existingUsers = new String[2];
	private ArrayList<User> users = new ArrayList<>();
	String newUser;
	
	Product[] electronicProducts = new Product[3];
	Product[] clothProducts = new Product[3];
	Product[] sportingProducts = new Product[3];
	
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// 유저가 고른 상품 번호
	int productNo;
	
	// 하나의 스캐너 객체 (각각의 메소드에서 사용됨)
	Scanner scanner = new Scanner(System.in);
	
	// 총 상품 금액
	int total = 0;

	/**
	 * 쇼핑몰 이름 설정(메인 함수에서 설정하기)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 기존 회원 등록하기
	 * @param id
	 * @param password
	 * 
	 */
	public void setExistingUsers(String id, String password) {		
		users.add(new User(id, password));		
	}
	
	/**
	 * 쇼핑몰 시작할 때 콘솔에 기본으로 찍히는 초기 알림
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " 쇼핑몰에 오신것을 환영합니다.  #");
		System.out.println("#  기존에 저희 쇼핑몰을 방문해 보신적이 있으신가요? [y/n]  #");
		System.out.printf("#  방문여부 : ");
		
		String isVisited = scanner.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
				System.exit(0); break;
		}
	}
	
	/**
	 * 기존 방문여부 y를 눌렀을 때, 기존에 존재하던 계정 고르는 메서드 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# 데이터 조회 결과, "+User.getCount()+"의 계정이 존재합니다. 원하시는 계정을 선택해주세요.");
		users.forEach(u -> System.out.println(u.toString()));
		System.out.printf("#  선택 -> ");
		
		int userNo = scanner.nextInt();
		
		if(userNo<0 || userNo > User.getCount()) {
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);  //시스템 종료 
		} else {
			//유저넘버는 users인덱스 번호보다 1크다. 그래서 -1해야 인덱스 번호임
			registeredUser(users.get(userNo-1).getId());
		}				
	}
	
	/**
	 * 회원가입
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  회원가입을 진행합니다.");
				
        String id = input(1);
        String password = input(2);

        System.out.println("계좌가 개설되었습니다!");
        users.add(new User(id, password));
		
				
		System.out.println("====================================================");
		System.out.println("#  " + id + "님 환영합니다. 원하시는 카테고리를 선택해주세요.");
		
		selectCategory();
	}
    /**
     * 입력한 문자열이 공백있는지 비번은 다시한번 확인
     */
    private String input(int mode) {
    	
        String result = null;

        switch (mode) {
            case 1:
                while (true) {
                    System.out.println("id를 입력하세요!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("id는 공백을 허용하지 않습니다!");
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("비밀번호를 입력하세요!");
                    result = scanner.nextLine();

                    System.out.println("비밀번호 확인을 입력하세요!");
                    String passwordCheck = scanner.nextLine();

                    if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
                        System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다!");
                    } else if (!result.equals(passwordCheck)) {
                        System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                while (true) {
                    System.out.println("비밀번호를 입력하세요!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("비밀번호가 공백입니다!");
                    } else {
                        break;
                    }
                }
                break;
        }

        return result;
    }
	
	/**
	 * 기존에 등록된 계정 불러오기
	 * @param userName
	 */
	public void registeredUser(String userId) {
		
		System.out.println("===================================================");
		System.out.println("#  " + userId + "님 환영합니다. 원하시는 카테고리를 선택해주세요.");
		
		selectCategory();
	}
		
	/**
	 * 쇼핑몰 게임 실행 시, 상품 generate
	 */
	public void genProduct() {
		
		electronicProducts[0] = new Electronic("전자기기","LG그램", 1500000, 5);
		electronicProducts[1] = new Electronic("전자기기","삼성 세탁기", 2000000, 2);
		electronicProducts[2] = new Electronic("전자기기","에어팟 2세대", 150000, 3);
		
		clothProducts[0] = new Cloth("의류", "가을 코트", 250000, 2);
		clothProducts[1] = new Cloth("의류", "가을 청자켓", 120000, 2);
		clothProducts[2] = new Cloth("의류", "퓨마 롱패딩", 470000, 2);
		
		sportingProducts[0] = new SportingItem("스포츠용품","나이키 손목밴드", 23000, 5);
		 sportingProducts[1] = new SportingItem("스포츠용품","아디다스 축구화", 40000, 5);
		sportingProducts[2] = new SportingItem("스포츠용품","유벤투스 유니폼", 100000, 5);
	}
	
	/**
	 * 카테고리 목록 출력하기
	 */
	public void selectCategory() {
		
		System.out.println("┏━━카테고리목록━━┓");
		System.out.println("┃ 1. 전자기기   ┃");
		System.out.println("┃ 2. 의류      ┃");
		System.out.println("┃ 3. 스포츠용품  ┃");
		System.out.println("┗━━━━━━━━━━━━━┛");
		System.out.println("#  [0] : 장바구니 물품을 계산합니다.");
		System.out.printf("#  선택 -> ");
		
		int categoryNo = scanner.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * 카테고리 해당 번호에 맞는 상품 목록 출력
	 * @param categoryNo
	 */
	public void printProductList(int categoryNo) {
		switch(categoryNo) {
			case 0:
				
				checkout(); break;
			case 1:
				
				selectProduct(electronicProducts); break;
			case 2:
				
				selectProduct(clothProducts); break;
			case 3:
				
				selectProduct(sportingProducts); break;
			default:
				
				System.out.println("#  범위를 벗어났습니다. 프로그램이 종료되었습니다.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 	상품을 선택했을 때, 장바구니에 넣기
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s을 선택하셨습니다. 현재 장바구니 총 금액은 %d원 입니다.\n", product.getProductName(), total);
			System.out.println("#  Enter키를 누르시면 카테고리 목록이 출력됩니다.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  선택하신 %s 제품은 재고가 모두 소진되었습니다.\n", product.getProductName());
		}
		
		scanner.nextLine();
		scanner.nextLine(); // 입력 버퍼 지우기
		
		selectCategory();
	}
	
	/**
	 * 카테고리 해당 번호에 맞는 상품 목록 출력
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]의 의미는 0, 1, 2중 아무거나 와도 출력값이 같아서 0으로 설정함
		System.out.println("#  " + products[0].getCategoryName() + " 카테고리에 오신 것을 환영합니다. 원하시는 상품 번호를 입력해주세요.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  상품명" + (i + 1) + " : %s, 가격 : %d, 남은 재고 : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : 장바구니 물품들을 계산합니다.");
		System.out.printf("#  선택 -> ");
		
		productNo = scanner.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * 체크아웃
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  장바구니가 비어있습니다. 장바구니에 상품을 담아주세요.");
			
			selectCategory();
		} else {
			
			printShoppingBasket();
			System.out.printf("#  결제하실 총 금액은 %d원 입니다. \n#  ▼ 결제 방법을 선택해주세요 ▼\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  선택 -> ");
			
			int payment = scanner.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * 체크아웃할 때, 지금까지 장바구니에 넣어놨던 상품 목록들 확인차 출력
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("━━━━━━━━━━장바구니 목록━━━━━━━━━━━");
		System.out.println("순번\t   상품\t\t      가격");
		
		for (int i = 0; i < cart.size(); i++) {
			
			System.out.printf(" %d   ┃\t%s   \t┃%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
		}
		
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	/**
	 * 현금 계산
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  현금 지불을 택하셨습니다. 15% 할인되어 결제하실 최종 금액은 %d원 입니다.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  지불하실 현금을 입력해주세요 : ");
		
		int cash = scanner.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", cash, cash - total);
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d원을 더 지불하셔야 합니다.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * 현금 차액 지불하기
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  차액 지불하기 : ");
		
		int difference = scanner.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d원을 더 지불하셔야 합니다.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", difference , difference - (total - cash));
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다.");
		}
	}
	
	
	/**
	 * 카드 계산
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  영수증 필요하신가요?(y/n)");
		System.out.printf("#  선택 -> ");
		
		String isNeedRecipt = scanner.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  영수증 발급이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			
			System.exit(0); break;
		}
	}
	
}
