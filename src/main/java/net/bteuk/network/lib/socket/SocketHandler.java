package net.bteuk.network.lib.socket;

import net.bteuk.network.lib.dto.AbstractTransferObject;

public interface SocketHandler {

    AbstractTransferObject handle(AbstractTransferObject transferObject);

}
