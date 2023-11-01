package Day22;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File01 {

	public static void main(String[] args) throws IOException {
		// java.io.*에서 제공하는 클래스들은 try~catch / throws를 해줘야 한다.
		// 문자기반 출력 스트림
		// FileWriter를 이용한 파일 쓰기(다시 같은 이름을 생성하면 덮어쓰기)
		FileWriter fw = new FileWriter("writer.txt");
		
		for(int i = 1; i <= 10; i++) {
			String data = i + " test \r\n"; // 기록할 데이터 생성
			fw.write(data); // fw 파일에 기록한다.
			fw.write("my Project I/O Test \r\n");
		}
		fw.close();
		
		// 기존 파일에 데이터를 쓰려고 할때 :추가모드
		FileWriter fw1 = new FileWriter("writer.txt", true);
		for(int i = 11; i <= 20; i++) {
			String data = i + " append mode \r\n";
			fw1.write(data);
		}
		fw1.close();
		
		PrintWriter pw = new PrintWriter("writer2.txt");
		for(int i = 1; i <= 10; i++) {
			String data = i + " Test입니다.";
			pw.println(data);
		}
		pw.close();
		
		// PrintWriter는 추가모드가 없음.
		// 값을 추가하려면, 파일 객체를 생성해서 추가
		PrintWriter pw2 = new PrintWriter(new FileWriter("writer2.txt",true));
		for(int i = 11; i <= 20; i++) {
			String data = i + " append mode \r\n";
			pw2.write(data);
		}
		pw2.close();
		
		
		// FileOutputStream을 이용한 파일 쓰기
		// 바이트 기반 스트림
		FileOutputStream output = new FileOutputStream("out.txt");
		for(int i = 1; i <= 10; i++) {
			String data = i + " Test mode \r\n";
			output.write(data.getBytes()); // 바이트 기반 스트림이기 때문에 바이트 단위로 쓰기
		}
		output.close();
	}

}
