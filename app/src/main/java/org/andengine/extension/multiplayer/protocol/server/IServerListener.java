package org.andengine.extension.multiplayer.protocol.server;

public interface IServerListener<S extends Server<?, ?>> {
    // ===========================================================
    // Final Fields
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    public void onStarted(final S pServer);
    public void onTerminated(final S pServer);
    public void onException(final S pServer, final Throwable pThrowable);
}
