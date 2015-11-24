package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by vasil_000 on 21-Nov-15.
 */
public class Messenger
{
	ArrayList<Message> messages;
	IMessagePrinter printer;

	public Messenger()
	{
		messages = new ArrayList<Message>();
		printer = new FancyPrinter();
		messages.s
	}

	public void addMessage(String text)
	{
		messages.add(new Message(text, new Date()));
	}

	public void showLast()
	{
		Message last = messages.get(messages.size() - 1);
		printer.showMessages(new Message[]{last});
	}
}
