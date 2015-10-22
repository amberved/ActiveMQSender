package activemq.sender;

import java.text.SimpleDateFormat;

public class ActiveMQSenderApp {

	public static void main(String[] args) {
		ActiveMQSender sender = new ActiveMQSender("tcp://localhost:61616", "admin", "admin");
		try {
			while (true) {
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
				sender.sendMessage("First.queue", "Hello World @ "+ timeStamp);
				Thread.sleep(1000);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
