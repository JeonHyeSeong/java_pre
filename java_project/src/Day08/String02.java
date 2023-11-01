package Day08;

public class String02 {

	public static void main(String[] args) {
		// 자바의정석.java 파일명과 확장자명을 분리하여 출력
		// 파일명 : 자바의정석
		// 확장자명 : java
		String file = "자바의정석.java";
		System.out.println("파일명 : "+file.substring(0,file.indexOf(".")));
		System.out.println("확장자명 : "+file.substring(file.indexOf(".")+1));
		
		// file에서 java가 포함되어있으면 자바파일 이라고 출력
		// contains : 해당글자가 포함되어 있는지를 체크 boolean
		System.out.println(file.contains("java"));
		if(file.contains("java")) {
			System.out.println("자바파일");
		}

	}

}
