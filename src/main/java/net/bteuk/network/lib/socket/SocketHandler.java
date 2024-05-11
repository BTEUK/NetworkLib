package net.bteuk.network.lib.socket;

import net.bteuk.network.lib.dto.AbstractTransferObject;
import net.bteuk.network.lib.dto.Reply;

public interface SocketHandler {

    Reply handle(AbstractTransferObject transferObject);

}
