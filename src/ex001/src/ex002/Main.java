package ex002;

public class Main {

	// 피보나치 수열을 출력해라
	// An = An-1 + An-2
	// 1 1 2 3 5 8 13 21 34.. 1+1=2, 2+3=5,...근데 이거 n>3일때부터 조건이 만족돼서 0,1은 초기화 해야함
	public static void main(String[] args) {
		int[] arr = new int[100];
	
		arr[1]=1;  // 이거 0으로 하면 틀리더라. arr[0] 출력해보면 0으로 뜨긴함
		arr[2]=1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2]; // arr[3] = arr[2]+arr[1]
		}
		for(int i=1; i<=10; i++) {
			System.out.println(arr[i]+" ");
		}
		// 2번째 방법
		int prevPrevNum=1; // 전전 문자 = 1번문자 초기화
		int prevNum=1;  // 전 문자 =2번 문자 초기화
		System.out.println(prevPrevNum); // 초기화한 값 출력
		System.out.println(prevNum);
		
		for(int i=3; i<=10; i++) { // 8번 반복하게 됨
			int nNum = prevPrevNum+prevNum;
			System.out.println(nNum);
			prevPrevNum=prevNum;
			prevNum=nNum;
			
		}
		
	}
}
