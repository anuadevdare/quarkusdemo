import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class AppLifeCycleListener {
	
	public void onStart(@Observes StartupEvent startupEvent)
	{
		
	}
	public void onStop(@Observe ShutdownEvent shutdownEvent)
	{
		
	}

}
