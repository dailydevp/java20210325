package p08.textbook.s080303;

import p08.textbook.s080205.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:"+this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
}
