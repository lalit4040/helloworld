package org.vaadin.samples.helloworld;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
@SuppressWarnings("serial")
public class HelloWorldUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = HelloWorldUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
    	
    	// not using package structure properly ... time !!
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);

        layout.addComponent(new Label("Hello !!"));

        Button hmaButton = new Button("Download Pdf for HMA");
        hmaButton.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
            	
            	GeneratePdf generatePdf = new GeneratePdf();
            	generatePdf.setiPdfGenerater(new GenerateByPax());
            	generatePdf.generatePdf();
            }
        });
        
        Button cmgButton = new Button("Download Pdf for CMG");
        cmgButton.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
            	GeneratePdf generatePdf = new GeneratePdf();
            	generatePdf.setiPdfGenerater(new GenerateByItem());
            	generatePdf.generatePdf();
            }
        });
        

        layout.addComponent(hmaButton);
        layout.addComponent(cmgButton);
    }

}
