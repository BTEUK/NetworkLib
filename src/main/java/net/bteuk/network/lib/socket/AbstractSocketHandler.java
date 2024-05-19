package net.bteuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.bteuk.network.lib.dto.AbstractTransferObject;
import net.bteuk.network.lib.dto.Reply;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class AbstractSocketHandler extends Thread {

    private final Socket clientSocket;

    private final SocketHandler handler;

    public AbstractSocketHandler(Socket clientSocket, SocketHandler handler) {
        this.clientSocket = clientSocket;
        this.handler = handler;
    }

    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
        ) {

            ObjectMapper mapper = new ObjectMapper();
            AbstractTransferObject object = mapper.readValue(in, AbstractTransferObject.class);

            // Handle the different objects.
            AbstractTransferObject reply = handler.handle(object);

            // If the reply is not null return it as output.
            if (reply != null) {
                mapper.writeValue(out, reply);
                out.flush();
            }

            // Close the socket;
            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
