package example;

public class Split_String {

	public static void main(String[] args) {
		// Split() 문자열을 나눠서 배열로 리턴
		String text1 = "(CNN)As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "엠브레인·케이스탯·코리아리서치·한국리서치 등 4개사가 공동으로 실시해 9일 발표한 전국지표조사(NBS·National Barometer Survey)에서 ‘내년 대선에서 누구에게 투표할 생각인가’란 질문에 이 후보가 38%, 윤 후보는 36%였다. 지난주 조사에선 윤 후보(34%)가 이 후보(33%)보다 1%포인트 높았지만, 이번 주에는 이 후보가 5%포인트 올랐고 윤 후보는 2%포인트 상승에 그치면서 이 후보가 오차범위 내인 2%포인트 차이로 앞섰다. 다음은 안철수 국민의당 후보 4%, 심상정 정의당 후보 3%였고 지지 후보가 ‘없다’ 또는 ‘모름·무응답’은 17%였다.";
		
		// String[] words = text1.split("[^a-zA-Z]+"); // 영문 철자를 제외한 특수문자 스페이스, 점, 슬래시등을 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개 이하면 제외
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
	}

}
