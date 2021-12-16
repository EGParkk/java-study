package application;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
    private ArrayList<Account> mAccounts = new ArrayList<>();
    private boolean isRunning = true;
    private Scanner scanner = new Scanner(System.in);
    private final String ADMIN_ID = "admin"; //관리자 id
    private final String ADMIN_PASS = "1234"; //관리자 패스워드

    /**
     * 은행 계좌개설 프로그램 시작
     * isRunnning이 false시 종료
     */
    public void run() {
        while (isRunning) {
            displayMenu();
        }
        scanner.close();
    }
    /**
     * 메뉴를 콘솔에 출력
     */
    private void displayMenu() {
        
        System.out.println("1. 계좌 개설");
        System.out.println("2. 계좌 조회");
        System.out.println("3. 관리자 로그인");
        System.out.println("4. 종료");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                makeAccount();
                break;
            case 2:
                checkAccount();
                break;
            case 3:
                admin();
                break;
            case 4:
                System.out.println("프로그램을 종료합니다!");
                isRunning = false;
                break;
            default:
                System.out.println("존재하지 않는 기능입니다!");
        }
    }
    /**
     * 계좌를 개설하여 리스트에 추가
     */
    private void makeAccount() {
        System.out.println("계좌 개설을 진행합니다!");

        String id = input(1);
        String password = input(2);

        System.out.println("계좌가 개설되었습니다!");
        mAccounts.add(new Account(id, password, 0));
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
     * 계좌 조회시 id와 패스워드를 확인하여
     * 있으면 조회한다.
     */
    private void checkAccount() {
        System.out.println("계좌를 조회합니다!");

        String id = input(1);
        String password = input(3);

        boolean isExist = false;
        for (Account each : mAccounts) {
            String eachId = each.getId();
            String eachPassword = each.getPassword();

            if (id.equals(eachId) && password.equals(eachPassword)) {
                System.out.println("조회하신 계좌의 정보는 다음과 같습니다!");
                System.out.printf("계좌명 : %s, 비밀번호 : %s, 잔액 : %d", eachId, eachPassword, each.getMoney());
                System.out.println();
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("그러한 계좌는 존재하지 않습니다!");
        }
    }
    /**
     * 관리자 모드 접속시 모든 계좌의 정보를 출력
     */
    private void admin() {
        System.out.println("관리자 모드입니다!");

        String id = input(1);
        String password = input(3);
        
        if (id.equals(ADMIN_ID) && password.equals(ADMIN_PASS)) {
            System.out.println("관리자 로그인에 성공하셨습니다.");
            System.out.println("개설된 회원들의 정보는 다음과 같습니다.");

            for (Account each : mAccounts) {
                System.out.printf("계좌명 : %s, 비밀번호 : %s, 잔액 : %d\r\n", each.getId(), each.getPassword(), each.getMoney());
            }
        } else {
            System.out.println("아이디 또는 비밀번호가 올바르지 않습니다!");
        }
    }
}
