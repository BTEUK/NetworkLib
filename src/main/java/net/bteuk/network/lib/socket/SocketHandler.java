package net.bteuk.network.lib.socket;

import net.bteuk.network.lib.dto.AbstractTransferObject;

public interface SocketHandler {

    void handle(AbstractTransferObject transferObject);

}
