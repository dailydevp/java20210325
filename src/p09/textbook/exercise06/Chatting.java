package p09.textbook.exercise06;

public class Chatting {
	void startChat(String chatId) {
	//	String nickName = null;
		//nickName = chatId;
		Chat chat = new Chat() {
		
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}



//값한번만할당하든가
//nickName = chatID;
//Chat chat = new Chat()  값이 두번 할당됨.
//아님
//String nickName = chatId;