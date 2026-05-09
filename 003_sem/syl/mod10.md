# Module 10 : Networking with `java.net`

This module teaches:

> How Java programs communicate over networks.

Using networking, Java apps can:

* send messages
* connect to servers
* transfer files
* build chat apps
* access internet resources

Package:

```java id="m1x8q4"
java.net
```

---

# Basic Networking Idea

Two computers communicate using:

```text id="r4v2k7"
IP Address + Port Number
```

Example:

```text id="v7m1q5"
192.168.1.1 : 8080
```

---

# Important Terms

| Term       | Meaning                       |
| ---------- | ----------------------------- |
| IP Address | Device identity               |
| Port       | Specific application endpoint |
| Protocol   | Communication rules           |
| Client     | Requests service              |
| Server     | Provides service              |

---

# TCP vs UDP

Very important.

| TCP                 | UDP            |
| ------------------- | -------------- |
| Reliable            | Faster         |
| Connection-oriented | Connectionless |
| Ordered delivery    | No guarantee   |
| Uses Socket         | Uses Datagram  |

---

# 1. InetAddress Class

Represents IP address.

Used to:

* get host IP
* get hostname
* resolve domain names

---

# Example

```java id="q2m7v9"
import java.net.*;

class Test {

    public static void main(String args[])
    throws Exception {

        InetAddress ip =
        InetAddress.getByName("google.com");

        System.out.println(ip);
    }
}
```

---

# Important Methods

| Method           | Purpose              |
| ---------------- | -------------------- |
| getByName()      | Get IP from hostname |
| getHostName()    | Get hostname         |
| getHostAddress() | Get IP address       |
| getLocalHost()   | Current machine IP   |

---

# Example

```java id="w5x1m3"
InetAddress ip =
InetAddress.getLocalHost();

System.out.println(
ip.getHostAddress());
```

---

# Output Example

```text id="p8v4q6"
192.168.x.x
```

---

# DNS Concept

When you write:

```text id="k3m9v2"
google.com
```

DNS converts it into IP address using:

```java id="a7x2q5"
InetAddress
```

Tiny internet phonebook 📖🌐

---

# 2. Socket Class

Used for:

```text id="u1m8v7"
TCP communication
```

Connection-oriented communication.

---

# Client-Server Model

```text id="b4q2x9"
Client ↔ Server
```

---

# Socket

Represents communication endpoint.

---

# Important Classes

| Class        | Purpose     |
| ------------ | ----------- |
| Socket       | Client side |
| ServerSocket | Server side |

---

# Client Example

```java id="n7v3m1"
Socket s =
new Socket("localhost", 5000);
```

Meaning:

```text id="d2x8q4"
Connect to server at port 5000
```

---

# Server Example

```java id="f5m1v8"
ServerSocket ss =
new ServerSocket(5000);

Socket s = ss.accept();
```

---

# Important Methods

| Method            | Purpose          |
| ----------------- | ---------------- |
| getInputStream()  | Receive data     |
| getOutputStream() | Send data        |
| close()           | Close connection |

---

# Basic TCP Flow

```text id="j8q4m2"
Server starts
     ↓
Client connects
     ↓
Socket created
     ↓
Data transfer
```

---

# Example Communication

## Client Sends

```java id="s4v1x7"
DataOutputStream dout =
new DataOutputStream(
s.getOutputStream());

dout.writeUTF("Hello");
```

---

## Server Receives

```java id="y2m8q5"
DataInputStream din =
new DataInputStream(
s.getInputStream());

String msg = din.readUTF();
```

---

# Why TCP Used?

Reliable communication.

Used in:

* web servers
* banking
* login systems
* chats

---

# 3. DatagramSocket Class

Used for:

```text id="g7v2m9"
UDP communication
```

Connectionless communication.

---

# UDP Characteristics

* fast
* lightweight
* unreliable

No guarantee packet arrives.

---

# Example

```java id="t1x5q8"
DatagramSocket ds =
new DatagramSocket();
```

---

# Receiving Socket

```java id="h4m9v3"
DatagramSocket ds =
new DatagramSocket(5000);
```

---

# Important Methods

| Method    | Purpose        |
| --------- | -------------- |
| send()    | Send packet    |
| receive() | Receive packet |
| close()   | Close socket   |

---

# Where UDP Used?

* video streaming
* gaming
* voice calls
* DNS

Speed preferred over reliability.

---

# 4. DatagramPacket Class

Represents actual UDP data packet.

Contains:

* data
* destination IP
* port number

---

# Sending Example

```java id="k6q2m7"
String msg = "Hello";

byte b[] = msg.getBytes();

InetAddress ip =
InetAddress.getByName("localhost");

DatagramPacket dp =
new DatagramPacket(
b,
b.length,
ip,
5000);
```

Send:

```java id="p3v8x1"
ds.send(dp);
```

---

# Receiving Example

```java id="c7m1q4"
byte b[] = new byte[1024];

DatagramPacket dp =
new DatagramPacket(
b,
b.length);

ds.receive(dp);
```

---

# Convert Bytes to String

```java id="r5x2m9"
String s =
new String(dp.getData());
```

---

# DatagramSocket vs Socket

| Socket              | DatagramSocket |
| ------------------- | -------------- |
| TCP                 | UDP            |
| Reliable            | Unreliable     |
| Connection-oriented | Connectionless |
| Slower              | Faster         |

---

# Most Important Networking Flow

---

# TCP Communication

```text id="x1m4q8"
ServerSocket
      ↓
accept()
      ↓
Socket connection
      ↓
Input/Output Streams
```

---

# UDP Communication

```text id="v6q2m5"
DatagramSocket
      ↓
DatagramPacket
      ↓
send()/receive()
```

---

# Common Exceptions

Networking may throw:

* IOException
* UnknownHostException
* SocketException

Usually handled using:

```java id="z9v3m7"
try-catch
```

---

# Important Examples to Practice

---

# InetAddress

* getLocalHost()
* getHostAddress()

---

# TCP

* client-server socket connection
* sending strings

---

# UDP

* DatagramPacket sending
* DatagramSocket receiving

---

# Most Important Viva Questions

## Difference Between TCP and UDP

## Difference Between Socket and DatagramSocket

## What is InetAddress?

## What is Port Number?

## What is Client-Server Architecture?

## Difference Between:

```java id="u4m8x2"
Socket
ServerSocket
```

## Why UDP faster than TCP?

---

# Most Important Exam Areas

Focus heavily on:

* InetAddress methods
* Socket class
* DatagramSocket
* DatagramPacket
* TCP vs UDP
* Client-server model
* send()/receive()

---

# Real-World Usage

These concepts power:

* multiplayer games
* WhatsApp-like chats
* browsers
* APIs
* streaming apps
* cloud systems

Modern internet software is basically billions of sockets whispering packets across the planet 🌍📡
