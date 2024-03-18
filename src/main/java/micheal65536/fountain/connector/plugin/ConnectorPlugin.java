package micheal65536.fountain.connector.plugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ConnectorPlugin
{
	void init(@NotNull String arg, @NotNull Logger logger) throws ConnectorPluginException;

	void shutdown() throws ConnectorPluginException;

	void onServerReady() throws ConnectorPluginException;

	void onServerStopping() throws ConnectorPluginException;

	void onWorldSaved(byte[] data) throws ConnectorPluginException;

	@Nullable
	Inventory onPlayerConnected(@NotNull PlayerLoginInfo playerLoginInfo) throws ConnectorPluginException;

	@NotNull
	DisconnectResponse onPlayerDisconnected(@NotNull String uuid, @NotNull Inventory inventory) throws ConnectorPluginException;

	public static final class ConnectorPluginException extends Exception
	{
		public ConnectorPluginException()
		{
			super();
		}

		public ConnectorPluginException(String message)
		{
			super(message);
		}

		public ConnectorPluginException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public ConnectorPluginException(Throwable cause)
		{
			super(cause);
		}
	}
}