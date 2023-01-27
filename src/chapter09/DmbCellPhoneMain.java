package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰", "검정색", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("channel : " + dmbCellPhone.channel);
		
		//CellPhone의 메소드를 이용하여 통화
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("오늘 점심 메뉴는 뭔가요?");
		dmbCellPhone.receiveVoice("글쎄요 추천해주세요");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드를 이용하여 채널 바꾸기
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.ChangeChannelDmb(14);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}

}
