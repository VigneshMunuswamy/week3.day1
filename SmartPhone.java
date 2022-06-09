package week3.day1;

public class SmartPhone extends AndroidPhone{
public void connectWithWhatsapp() {
	System.out.println("Connect to whatsapp");
}
public void takeVideo() {
	System.out.println("Take a video - Smartphone class");
}

public static void main(String[] args) {
	SmartPhone myMob = new SmartPhone();
	myMob.sendMsg();
	myMob.makeCall();
	myMob.saveContact();
	myMob.model();
	myMob.takeVideo();
	myMob.connectWithWhatsapp();
}
}
