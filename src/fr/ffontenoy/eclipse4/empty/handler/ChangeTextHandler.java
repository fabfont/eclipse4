 
package fr.ffontenoy.eclipse4.empty.handler;

import javax.inject.Named;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.osgi.service.prefs.BackingStoreException;

public class ChangeTextHandler {
	@Execute
	public void execute(@Preference(nodePath = "fr.ffontenoy.eclipse4.empty") IEclipsePreferences prefs, @Optional @Named("fr.ffontenoy.eclipse4.empty.command.changeTextCommand.textParam") String text) {
		// more stuff...
		if (text == null)
			return;
		
		prefs.put("text", text);
		// Persists
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}

	}
		
}