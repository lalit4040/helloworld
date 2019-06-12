package org.vaadin.samples.helloworld;

public class GeneratePdf {
	@SuppressWarnings("unused")
	private IPdfGenerater iPdfGenerater;

	public void setiPdfGenerater(IPdfGenerater iPdfGenerater) {
		this.iPdfGenerater = iPdfGenerater;
	}
	
	public void generatePdf() {
		iPdfGenerater.generatePdf();
	}
}
