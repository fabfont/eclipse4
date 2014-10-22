 
package fr.ffontenoy.eclipse4.empty.part;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MyPart {
	
	private Label mLabel;
	
	private boolean mIsInitialized = false;
	
	@Inject
	public MyPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {

		parent.setLayout(new GridLayout(1, false));
		
		mLabel = new Label(parent, SWT.NONE);
		mLabel.setText("This is my initial label");
		
		mIsInitialized = true;
	}
	
	@Inject
	public void listenPrefModifcation(@Optional @Preference(nodePath = "fr.ffontenoy.eclipse4.empty", value="text") String text) {
		if (mIsInitialized) {
			if (text != null && !text.isEmpty())
				mLabel.setText(text);
		}
	}
	
	
	
}