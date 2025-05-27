import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Server says: " + input.readLine());
        String line;
        while (!(line = userInput.readLine()).equalsIgnoreCase("exit")) {
            output.println(line);
        }

        socket.close();
    }
}
