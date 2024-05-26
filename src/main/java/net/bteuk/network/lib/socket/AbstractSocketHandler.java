package net.bteuk.network.lib.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.stream.Collectors;

public class AbstractSocketHandler extends Thread {

    private final Socket clientSocket;

    private final SocketHandler handler;

    public AbstractSocketHandler(Socket clientSocket, SocketHandler handler) {
        this.clientSocket = clientSocket;
        this.handler = handler;
    }

    public void run() {
        try (
                BufferedReader input = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {

            System.out.println(input.lines().collect(Collectors.toList()));
            //ObjectMapper mapper = new ObjectMapper();
            //AbstractTransferObject object = mapper.readValue(input, AbstractTransferObject.class);

            // Handle the different objects.
            //handler.handle(object);

            // Close the socket;
            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
