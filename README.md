# Network Programming with Sockets in Java

## Project Overview
This project demonstrates basic network programming using **sockets** in Java, enabling multiple clients to connect and communicate with a central server. The server and clients exchange messages over the network using TCP sockets, providing a simple example of client-server architecture.

### Project Goal
The main objectives of this project are:
- Creating a basic network environment where clients can connect to a server, communicate, and exchange messages.
- Practicing network programming and understanding the essential concepts of sockets, client-server interactions, IP addresses, and ports.

### Components
The project includes two Java programs:
1. **Server**: Accepts connections from clients and enables message exchange.
2. **Client**: Connects to the server and interacts by sending and receiving messages.

Each component is in its own project folder:
- **SERVER Project**: Contains the server-side code (`ServerClass.java`).
- **Client Project**: Contains the client-side code (`ClientClass.java`).

---

## How It Works

### Server
The server program (`ServerClass`) does the following:
1. Starts a `ServerSocket` on port `8080`.
2. Waits for clients to connect using the `accept()` method.
3. When a client connects, the server initializes input and output streams to communicate.
4. The server sends a greeting message to the client and waits for a response.
5. The server displays the client's response message on the console.

#### Key Code Sections (Server)
- **Socket Initialization**: Creates a server socket on port `8080`.
- **Connection Handling**: Accepts client connections and sets up input/output streams.
- **Message Exchange**: Sends a greeting message to the client and receives a response.

### Client
The client program (`ClientClass`) performs the following steps:
1. Connects to the server's IP address (`127.0.0.1`) and port (`8080`).
2. Sets up input and output streams to communicate with the server.
3. Receives a greeting message from the server and displays it.
4. Sends a response message back to the server, which is displayed in the console.

#### Key Code Sections (Client)
- **Socket Connection**: Connects to the server using the specified IP address and port.
- **Communication Streams**: Initializes streams for sending and receiving data.
- **Message Exchange**: Receives a greeting message from the server and sends a response back.

### Requirements
- Java Development Kit (JDK) installed.
- Basic knowledge of Java programming and network concepts.

### How to Run
1. Run the `ServerClass` program to start the server.
2. Run the `ClientClass` program to connect to the server and exchange messages.

**Note:** The server must be running before the client program can connect.

## Conclusion
This project provides a foundational understanding of Java network programming. Through sockets, IP addresses, and port numbers, we’ve created a simple client-server interaction model. This exercise is an excellent starting point for learning about network communication and developing more complex distributed systems.