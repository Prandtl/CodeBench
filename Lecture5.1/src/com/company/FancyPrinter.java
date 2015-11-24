package com.company;

/**
 * Created by vasil_000 on 21-Nov-15.
 */
public class FancyPrinter implements IMessagePrinter
{

	@Override
	public void showMessages(Message[] messagesToShow)
	{
		for (int i=0;i<messagesToShow.length;i++)
		{
			showMessage(messagesToShow[i]);
		}
	}

	private void showMessage(Message message)
	{
		String[] timeSplit = message.time.toString().split(" ");

		System.out.println("*" + timeSplit[1] + " " + timeSplit[2] + " " + timeSplit[3] + "*");
		System.out.println("Message is: " + message.text);
	}
}
