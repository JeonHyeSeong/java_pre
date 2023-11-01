package Day22;

import java.io.File;

public class File05 {

	public static void main(String[] args) {
		
		File f = new File("D:\\전혜성\\_java_workspace\\java_project\\out2.txt");
		String fileName = f.getName(); // 파일의 경로 빼고 이름만 추출
		System.out.println("경로를 제외한 파일이름 : "+fileName);
		System.out.println("경로를 포함한 파일이름 : "+f.getPath());
		System.out.println("경로를 포함한 파일이름 : "+f.getAbsolutePath());
		System.out.println("경로만 : "+f.getParent());
		System.out.println("파일 구분자 : "+File.separator); // 자주 사용
		
		// f에 대한 경로(드라이브,경로,파일명,확장자)
		// 문자 추출을 통해서 분리
		System.out.println("---f에 대한 경로---");
		String fileName2 = f.getAbsolutePath().substring(0,2);
		System.out.println("드라이브 : "+fileName2);
		String fileName3 = f.getAbsolutePath().substring(3, f.getAbsolutePath().lastIndexOf(File.separator));
		System.out.println("경로 : "+fileName3);
		String fileName4 = f.getName();
		String fileName5 = fileName4.substring(0, fileName4.lastIndexOf("."));
		System.out.println("파일명 : "+fileName5);
		String fileName6 = fileName4.substring(fileName4.lastIndexOf(".")+1);
		System.out.println("확장자 : "+fileName6);
		
		// 문자열의 추가나 변경등 많은 작업을 할 경우 String => StringBuffer 많이 사용.
		StringBuffer sb = new StringBuffer();
		// append 추가
		sb.append("Hello");
		sb.append(" ");
		sb.append("World~!!");
		// insert 사이에 추가
		sb.insert(0, "JAVA ");
		sb.insert(sb.indexOf("H"), "Hi~!! ");
		// delete 삭제
		sb.delete(0, sb.indexOf("!!")+1);
		
		System.out.println(sb.toString());
		
		String b = "";
		b += "Hello~!!";
		b += " ";
		b += "World~!!";
		System.out.println(b);

	}

}
