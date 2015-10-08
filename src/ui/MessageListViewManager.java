/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.*;
import java.util.Calendar;

/**
 *
 * @author footman
 */
public class MessageListViewManager {
	private final JTextArea listView;

	public MessageListViewManager(JTextArea jTextArea){
		this.listView = jTextArea;
	}
	
	public void addNewMessage(String text, String sourceName, String destName){
            listView.append(getCurrentTime() + "  " + sourceName + "��" + destName + "˵��\n");
            listView.append(text + "\n");
	}
	
	private String getCurrentTime(){
		Calendar t = Calendar.getInstance();
		int year = t.get(Calendar.YEAR);
		int month = t.get(Calendar.MONTH) + 1;
		int date = t.get(Calendar.DATE);
		int hour = t.get(Calendar.HOUR_OF_DAY);
		int minute = t.get(Calendar.MINUTE);
		return year + "��" + month + "��" + date + "��" + hour + "ʱ" + minute + "��";
	}
}
