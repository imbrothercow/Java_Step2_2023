package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new FileDownloadService());
		method(new LoginService());
		
	}
	
	//메소드명 method(static)
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
