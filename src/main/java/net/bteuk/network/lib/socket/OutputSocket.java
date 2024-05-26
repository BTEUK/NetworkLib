package net.bteuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.bteuk.network.lib.dto.AbstractTransferObject;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class OutputSocket {

    private final String ip;

    private final int port;

    public OutputSocket(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void sendSocketMessage(AbstractTransferObject transferObject) {
        try (
                Socket socket = new Socket(ip, port);
                OutputStream output = new BufferedOutputStream(socket.getOutputStream())
        ) {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(output, transferObject);

        } catch (IOException ex) {
            //LOGGER.severe("Could not broadcast message to server socket!");
        }
    }
}
