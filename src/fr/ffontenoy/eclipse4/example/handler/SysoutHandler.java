 
package fr.ffontenoy.eclipse4.example.handler;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;

/**
 * Just for printing something 
 */
public class SysoutHandler {
	@Execute
	public void execute(@Preference(nodePath = "fr.ffontenoy.eclipse4.example") IEclipsePreferences prefs) {
		System.out.println("HELLO WORLD!!!");
		System.out.println(prefs.get("text", "My Default Text"));
	}
		
}
