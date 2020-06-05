package com.pradeep.sockets;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    private static final Charset charset = StandardCharsets.UTF_8;

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://api.icndb.com/jokes/random?firstName=Bridge&lastName=i2i");
        String response = getResource(url);
        System.out.println("final response - " + response);
    }

    private static String getResource(URL url) {
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();
        path = path == null ? "" : path;
        query = query == null ? "" : query;

        // Create a TCP Socket
        Socket socket = createSocket(host);

        // Send request message through the socket
        sendRequest(socket, host, path, query);
        return getResponse(socket);
    }

    private static Socket createSocket(String host) {
        final int port = 80;
        Socket socket = null;
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }

    private static void sendRequest(Socket socket, String host, String path, String query) {
        // construct the request message with path and reg. params
        String requestMessage = String.format(
                "GET %s%s HTTP/1.1\r\n" +
                        "Host: %s\r\n" +
                        "\r\n",
                path, query, host
        );
        System.out.println("requestMessage - \n" + requestMessage);

        try {
            socket.getOutputStream().write(requestMessage
                    .getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getResponse(Socket socket) {
        String response = "";
        try (InputStream inputStream = socket.getInputStream()) {
            response = IOUtils.toString(inputStream, charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
