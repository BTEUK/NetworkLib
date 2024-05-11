package net.bteuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.bteuk.network.lib.dto.AbstractTransferObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class OutputSocket {

    private final String ip;

    private final int port;

    public OutputSocket(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public AbstractTransferObject sendSocketMessage(AbstractTransferObject transferObject) {
        try (
                Socket socket = new Socket(ip, port);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(out, transferObject);

            out.flush();

            return mapper.readValue(in, AbstractTransferObject.class);

        } catch (IOException ex) {
            //LOGGER.severe("Could not broadcast message to server socket!");
            return null;
        }
    }
}
