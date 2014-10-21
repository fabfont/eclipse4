 
package fr.ffontenoy.eclipse4.empty.part;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MyPart {
	@Inject
	public MyPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {

		parent.setLayout(new GridLayout(1, false));
		
		Label lLabel = new Label(parent, SWT.NONE);
		lLabel.setText("This is my label");
	}
	
	
	
	
}