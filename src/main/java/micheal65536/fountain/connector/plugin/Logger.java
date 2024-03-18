package micheal65536.fountain.connector.plugin;

import org.jetbrains.annotations.NotNull;

public interface Logger
{
	void error(@NotNull String message);

	void error(@NotNull String message, @NotNull Throwable throwable);

	void error(@NotNull Throwable throwable);

	void warn(@NotNull String message);

	void warn(@NotNull String message, @NotNull Throwable throwable);

	void warn(@NotNull Throwable throwable);

	void info(@NotNull String message);

	void info(@NotNull String message, @NotNull Throwable throwable);

	void info(@NotNull Throwable throwable);

	void debug(@NotNull String message);

	void debug(@NotNull String message, @NotNull Throwable throwable);

	void debug(@NotNull Throwable throwable);
}