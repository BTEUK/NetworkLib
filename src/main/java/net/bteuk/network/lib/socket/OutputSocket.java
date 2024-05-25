package net.bteuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.bteuk.network.lib.dto.AbstractTransferObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(out, transferObject);

            out.flush();

        } catch (IOException ex) {
            //LOGGER.severe("Could not broadcast message to server socket!");
        }
    }
}
