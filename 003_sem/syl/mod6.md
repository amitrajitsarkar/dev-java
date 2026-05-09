# Module 6 : I/O Programming in Java

I/O means:

```text
Input / Output
```

Used for:

* reading files
* writing files
* keyboard input
* storing objects
* handling binary data

This module teaches how Java communicates with:

* files
* memory
* external devices

---

# 1. Text and Binary I/O

Two major types of file handling.

---

# A) Text I/O

Handles human-readable data.

Example file:

```text
Hello
123
Java
```

Stored as characters.

---

# Used For

* `.txt`
* `.csv`
* logs
* source code

---

# Important Classes

| Class          | Purpose           |
| -------------- | ----------------- |
| FileReader     | Reads text        |
| FileWriter     | Writes text       |
| BufferedReader | Fast reading      |
| BufferedWriter | Fast writing      |
| Scanner        | Input parsing     |
| PrintWriter    | Formatted writing |

---

# Example: Writing Text File

```java id="j1x8c2"
FileWriter fw = new FileWriter("test.txt");

fw.write("Hello Java");

fw.close();
```

---

# Example: Reading Text File

```java id="t4k9m1"
FileReader fr = new FileReader("test.txt");

int ch;

while((ch = fr.read()) != -1) {
    System.out.print((char) ch);
}

fr.close();
```

---

# Important

```java
-1
```

means:

```text
End Of File (EOF)
```

---

# B) Binary I/O

Handles raw bytes instead of characters.

Used for:

* images
* videos
* audio
* PDFs
* executables

---

# Binary Example

Image file:

```text
101010011010...
```

Not human-readable.

---

# Important Classes

| Class                | Purpose             |
| -------------------- | ------------------- |
| FileInputStream      | Read bytes          |
| FileOutputStream     | Write bytes         |
| BufferedInputStream  | Fast binary reading |
| BufferedOutputStream | Fast binary writing |

---

# Example: Binary Write

```java id="w7a5q0"
FileOutputStream fos =
new FileOutputStream("data.bin");

fos.write(65);

fos.close();
```

Output stores byte value:

```text
65 → 'A'
```

---

# Example: Binary Read

```java id="l9f3z7"
FileInputStream fis =
new FileInputStream("data.bin");

int i = fis.read();

System.out.println(i);

fis.close();
```

---

# Text I/O vs Binary I/O

| Text I/O           | Binary I/O       |
| ------------------ | ---------------- |
| Character-based    | Byte-based       |
| Human-readable     | Machine-readable |
| Slower for media   | Better for media |
| Uses Reader/Writer | Uses Streams     |

---

# 2. Binary I/O Classes

Java uses:

```text
Streams
```

for binary operations.

---

# Stream

A flow of data.

Like:

```text
Water pipe carrying bytes
```

---

# Important Binary Classes

---

## InputStream

Reads bytes.

Parent class.

---

## OutputStream

Writes bytes.

Parent class.

---

# Common Child Classes

| Class               | Use                  |
| ------------------- | -------------------- |
| FileInputStream     | Read file            |
| FileOutputStream    | Write file           |
| BufferedInputStream | Buffered reading     |
| DataInputStream     | Read primitive data  |
| DataOutputStream    | Write primitive data |

---

# DataInputStream Example

```java id="n6d2v4"
DataOutputStream dos =
new DataOutputStream(
new FileOutputStream("num.dat"));

dos.writeInt(100);

dos.close();
```

Reading:

```java id="b4r1k8"
DataInputStream dis =
new DataInputStream(
new FileInputStream("num.dat"));

System.out.println(dis.readInt());
```

---

# Why Important?

Allows storing:

* int
* float
* boolean
* double

directly in binary format.

---

# 3. Object I/O

Very important Java topic.

Object I/O means:

> storing entire objects into files.

Called:

```text
Serialization
```

---

# Serialization

Converting object → byte stream.

---

# Deserialization

Byte stream → object.

---

# Important Interface

```java id="q2u7h1"
Serializable
```

---

# Example

```java id="s5g0m9"
import java.io.*;

class Student implements Serializable {
    int id = 1;
    String name = "Amit";
}
```

---

# Writing Object

```java id="f8w3x6"
ObjectOutputStream oos =
new ObjectOutputStream(
new FileOutputStream("obj.dat"));

Student s = new Student();

oos.writeObject(s);

oos.close();
```

---

# Reading Object

```java id="h3n1p7"
ObjectInputStream ois =
new ObjectInputStream(
new FileInputStream("obj.dat"));

Student s = (Student) ois.readObject();

System.out.println(s.name);

ois.close();
```

---

# Uses of Object I/O

Very heavily used in:

* databases
* caching
* networking
* distributed systems
* session storage

---

# transient Keyword

Used to prevent variable serialization.

```java id="m8c2t4"
transient int password;
```

---

# static Variables and Serialization

Static variables are NOT serialized.

Because they belong to class, not object.

---

# 4. Random Access Files

Very important file concept.

Normally files are accessed:

```text
Start → End
```

Random Access allows:

```text
Jump directly anywhere in file
```

Like moving video timeline slider 🎞️

---

# Java Class

```java id="v4j7s1"
RandomAccessFile
```

---

# Example

```java id="c9e5r2"
RandomAccessFile raf =
new RandomAccessFile("data.txt", "rw");
```

Modes:

| Mode | Meaning      |
| ---- | ------------ |
| r    | Read         |
| rw   | Read & Write |

---

# Important Methods

| Method           | Purpose           |
| ---------------- | ----------------- |
| seek()           | Move file pointer |
| read()           | Read data         |
| write()          | Write data        |
| getFilePointer() | Current position  |

---

# Example

```java id="k1u8o6"
raf.seek(5);
```

Moves pointer to byte 5.

---

# Random Access Example

```java id="d7l3y9"
raf.writeInt(100);

raf.seek(0);

System.out.println(raf.readInt());
```

---

# Uses of Random Access Files

Used in:

* databases
* media players
* large file editing
* indexed storage systems

---

# Important Concepts Related to This Module

---

# Buffering

Buffered classes improve performance.

Without buffering:

```text
Frequent disk access
```

With buffering:

```text
Data grouped before writing
```

Much faster.

---

# Stream Hierarchy

Very important theory topic.

```text
InputStream / OutputStream
Reader / Writer
```

---

# Byte Stream vs Character Stream

| Byte Stream  | Character Stream |
| ------------ | ---------------- |
| Binary data  | Text data        |
| InputStream  | Reader           |
| OutputStream | Writer           |

---

# Common Exceptions

File operations may throw:

* IOException
* EOFException
* FileNotFoundException

Usually handled with:

```java
try-catch
```

---

# Most Important Examples to Practice

---

# Text I/O

* FileReader/FileWriter
* BufferedReader

---

# Binary I/O

* FileInputStream/FileOutputStream
* DataInputStream

---

# Object I/O

* Serialization
* Deserialization

---

# Random Access

* seek()
* writeInt()
* readInt()

---

# Very Important Viva Questions

## Difference Between Text and Binary I/O

## What is Serialization?

## Why Serializable interface used?

## Difference Between Byte Stream and Character Stream

## Why buffering improves performance?

## What is RandomAccessFile?

---

# Most Important Exam Areas

Focus heavily on:

* File streams
* Serialization
* RandomAccessFile
* Binary vs text I/O
* Stream hierarchy
* Buffered classes
* ObjectInputStream/ObjectOutputStream

These topics become foundation for:

* networking
* databases
* backend development
* Android storage
* file systems
* distributed Java applications
