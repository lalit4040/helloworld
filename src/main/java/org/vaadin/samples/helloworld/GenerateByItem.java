package org.vaadin.samples.helloworld;

import com.vaadin.ui.Notification;

public class GenerateByItem implements IPdfGenerater{

	@Override
	public void generatePdf() {
		Notification.show("CMG downloading.");
		
	}

}
