package org.whispersystems.signalservice.api.messages;

import org.whispersystems.libsignal.util.guava.Optional;
import org.whispersystems.signalservice.api.messages.multidevice.SignalServiceSyncMessage;

public class SignalServiceContent {

  private final Optional<SignalServiceDataMessage> message;
  private final Optional<SignalServiceSyncMessage> synchronizeMessage;

  public SignalServiceContent() {
    this.message            = Optional.absent();
    this.synchronizeMessage = Optional.absent();
  }

  public SignalServiceContent(SignalServiceDataMessage message) {
    this.message = Optional.fromNullable(message);
    this.synchronizeMessage = Optional.absent();
  }

  public SignalServiceContent(SignalServiceSyncMessage synchronizeMessage) {
    this.message            = Optional.absent();
    this.synchronizeMessage = Optional.fromNullable(synchronizeMessage);
  }

  public Optional<SignalServiceDataMessage> getDataMessage() {
    return message;
  }

  public Optional<SignalServiceSyncMessage> getSyncMessage() {
    return synchronizeMessage;
  }
}
