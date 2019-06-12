package org.vaadin.samples.helloworld;

import com.vaadin.ui.Notification;

public class GenerateByPax implements IPdfGenerater {

	@Override
	public void generatePdf() {
		Notification.show("HMA downloading.");
		
	}

}
