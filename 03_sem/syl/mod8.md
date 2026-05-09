# Module 8 : Graphical Programming with AWT and Swing

This module teaches Java GUI programming.

GUI means:

```text id="bb3v8p"
Graphical User Interface
```

Instead of terminal output:

```text id="i9u2w4"
System.out.println()
```

you create:

* windows
* buttons
* menus
* forms
* graphics

Basically:

```text id="d5m1k8"
Java starts drawing actual desktop applications
```

---

# 1. AWT (Abstract Window Toolkit)

AWT is Java’s original GUI library.

Package:

```java id="o2f7v1"
java.awt
```

---

# Features

* platform dependent
* uses native OS components
* heavyweight components

---

# Heavyweight Components

AWT components depend on operating system GUI.

Example:

```text id="x6r3q9"
Windows button vs Linux button
```

may look different.

---

# Important AWT Components

| Component | Purpose            |
| --------- | ------------------ |
| Frame     | Main window        |
| Label     | Display text       |
| Button    | Clickable button   |
| TextField | Single-line input  |
| TextArea  | Multi-line input   |
| Checkbox  | Multiple selection |
| Choice    | Dropdown menu      |
| List      | List items         |
| Scrollbar | Scrolling          |

---

# 2. Frame

Frame is top-level window.

---

# Example

```java id="y8v1p4"
import java.awt.*;

class MyFrame {
    public static void main(String args[]) {

        Frame f = new Frame("My Window");

        f.setSize(400,300);

        f.setVisible(true);
    }
}
```

---

# Important Methods

| Method       | Purpose       |
| ------------ | ------------- |
| setSize()    | Window size   |
| setVisible() | Show window   |
| setTitle()   | Set title     |
| add()        | Add component |

---

# 3. Components

GUI elements added inside frame.

Example:

```java id="j4m7r2"
Button b = new Button("Click");
```

Add to frame:

```java id="w9n2x6"
f.add(b);
```

---

# 4. Working with 2D Shapes

Java supports graphics drawing.

Package:

```java id="a5v8k1"
java.awt.Graphics
```

and:

```java id="u1q4p9"
Graphics2D
```

---

# Common Shapes

| Method     | Shape            |
| ---------- | ---------------- |
| drawLine() | Line             |
| drawRect() | Rectangle        |
| drawOval() | Circle/Oval      |
| drawArc()  | Arc              |
| fillRect() | Filled rectangle |

---

# Example

```java id="m7r2v5"
public void paint(Graphics g) {

    g.drawRect(50,50,100,80);

    g.drawOval(200,50,100,100);
}
```

---

# Graphics Coordinate System

```text id="h8p3n6"
(0,0)
```

starts at top-left corner.

---

# 5. Using Colors

Class:

```java id="c3w7x2"
Color
```

---

# Example

```java id="t9m1v4"
g.setColor(Color.RED);

g.fillRect(50,50,100,100);
```

---

# Custom Color

```java id="k2q6r8"
Color c = new Color(255,0,0);
```

RGB:

```text id="n4x8p1"
Red Green Blue
```

---

# 6. Fonts

Class:

```java id="e7m2v9"
Font
```

---

# Example

```java id="p5r1k3"
Font f =
new Font("Arial", Font.BOLD, 20);

g.setFont(f);
```

---

# Font Styles

| Style  | Meaning |
| ------ | ------- |
| PLAIN  | Normal  |
| BOLD   | Bold    |
| ITALIC | Italic  |

---

# 7. Images

Class:

```java id="v3n7p2"
Image
```

---

# Example

```java id="q6m1w8"
Image img =
Toolkit.getDefaultToolkit()
.getImage("pic.jpg");
```

Display:

```java id="r2x9k4"
g.drawImage(img,50,50,this);
```

---

# 8. Basics of Event Handling

Very important GUI concept.

Event:

```text id="z5p8m1"
User interaction
```

Examples:

* mouse click
* keyboard press
* button click

---

# Event Handling Flow

```text id="f2q7x4"
Event Source
     ↓
Event Object
     ↓
Event Listener
```

---

# Example

Button click generates:

```text id="g8m3r6"
ActionEvent
```

---

# 9. Event Handlers

Objects that respond to events.

Implemented using listener interfaces.

---

# Example

```java id="h1v6p9"
class MyClass
implements ActionListener {

    public void actionPerformed(
        ActionEvent e) {

        System.out.println("Clicked");
    }
}
```

---

# Register Listener

```java id="u7x2m5"
button.addActionListener(this);
```

---

# 10. Adapter Classes

Used to simplify event handling.

Instead of implementing all methods manually.

---

# Example

Without adapter:

```text id="y4n8k2"
Must implement all interface methods
```

With adapter:

```text id="w6q1r3"
Override only needed methods
```

---

# Common Adapter Classes

| Adapter       | Related Listener |
| ------------- | ---------------- |
| MouseAdapter  | MouseListener    |
| KeyAdapter    | KeyListener      |
| WindowAdapter | WindowListener   |

---

# Example

```java id="s9m4x7"
class MyMouse extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }
}
```

---

# 11. Actions

Performed mainly using buttons/menu items.

Handled through:

```java id="l2p8v1"
ActionListener
```

---

# Button Example

```java id="b7x3q6"
Button b = new Button("OK");

b.addActionListener(this);
```

---

# 12. Mouse Events

Triggered by mouse interaction.

---

# Common Mouse Events

| Event         | Meaning        |
| ------------- | -------------- |
| mouseClicked  | Mouse clicked  |
| mousePressed  | Button pressed |
| mouseReleased | Released       |
| mouseEntered  | Cursor entered |
| mouseExited   | Cursor left    |

---

# Example

```java id="c1m9r4"
public void mouseClicked(MouseEvent e) {
    System.out.println(e.getX());
}
```

---

# 13. AWT Event Hierarchy

Important theory topic.

---

# Hierarchy

```text id="d5q8v2"
EventObject
   ↓
AWTEvent
   ↓
InputEvent
   ↓
MouseEvent / KeyEvent
```

Other important events:

* ActionEvent
* WindowEvent
* ItemEvent

---

# 14. Introduction to Swing

Swing is improved GUI library over AWT.

Package:

```java id="k7v2x5"
javax.swing
```

---

# Features

* platform independent look
* lightweight components
* richer controls

---

# Difference Between AWT and Swing

| AWT                 | Swing           |
| ------------------- | --------------- |
| Heavyweight         | Lightweight     |
| Native OS dependent | Pure Java       |
| Limited components  | Rich components |
| Older               | Modern          |

---

# Swing Components Start with J

| AWT       | Swing      |
| --------- | ---------- |
| Frame     | JFrame     |
| Button    | JButton    |
| Label     | JLabel     |
| TextField | JTextField |

---

# JFrame Example

```java id="n4m8x1"
import javax.swing.*;

class Test {
    public static void main(String args[]) {

        JFrame f =
        new JFrame("Swing");

        f.setSize(400,300);

        f.setVisible(true);
    }
}
```

---

# 15. Layout Management

Controls arrangement of components.

---

# Important Layout Managers

| Layout       | Purpose               |
| ------------ | --------------------- |
| FlowLayout   | Left-to-right         |
| BorderLayout | North/South/East/West |
| GridLayout   | Grid form             |
| CardLayout   | Card switching        |

---

# Example

```java id="r9v2k6"
f.setLayout(new FlowLayout());
```

---

# 16. Swing Components

---

# JTextField

Single-line text input.

```java id="m5q1x8"
JTextField tf =
new JTextField(20);
```

---

# JTextArea

Multi-line input.

```java id="p2v7n4"
JTextArea ta =
new JTextArea();
```

---

# JButton

```java id="x8m3q1"
JButton b =
new JButton("Submit");
```

---

# JCheckBox

Multiple selections.

```java id="u1k6r9"
JCheckBox c =
new JCheckBox("Java");
```

---

# JRadioButton

Single selection in group.

```java id="f7x2m5"
JRadioButton r =
new JRadioButton("Male");
```

Usually used with:

```java id="y4q8n2"
ButtonGroup
```

---

# Lists

```java id="g1v9k3"
JList
```

Displays list of items.

---

# Choice

Dropdown menu.

AWT component:

```java id="t6m2x7"
Choice c = new Choice();
```

Swing equivalent:

```java id="w3q8v1"
JComboBox
```

---

# Scrollbars

Used for scrolling content.

Swing:

```java id="h5v1m9"
JScrollPane
```

---

# 17. Windows

Top-level containers.

Examples:

* Frame
* Dialog
* Window

---

# 18. Menus

Menu bar support.

---

# Example

```java id="q2m8v4"
JMenuBar mb =
new JMenuBar();
```

Components:

* JMenu
* JMenuItem

---

# 19. Dialog Boxes

Popup windows.

---

# Example

```java id="l9v3x6"
JOptionPane.showMessageDialog(
null,
"Hello");
```

---

# Types

| Dialog  | Purpose     |
| ------- | ----------- |
| Message | Information |
| Confirm | Yes/No      |
| Input   | User input  |

---

# Most Important Examples to Practice

---

# AWT

* Frame creation
* Button click handling
* Mouse events
* Drawing shapes

---

# Swing

* JFrame
* JButton
* JTextField
* JCheckBox
* Radio buttons
* Menus
* JOptionPane

---

# Most Important Viva Questions

## Difference Between AWT and Swing

## What is Event Handling?

## What is Listener?

## What is Adapter Class?

## Difference Between TextField and TextArea

## What is Layout Manager?

## Difference Between Checkbox and RadioButton

---

# Most Important Exam Areas

Focus heavily on:

* Event handling
* ActionListener
* Mouse events
* Swing vs AWT
* Layout managers
* JFrame
* Graphics methods
* Adapter classes
* Dialog boxes

---

# Real-World Relevance

These concepts inspired:

* Java desktop apps
* IDEs like Eclipse IDE
* GUI frameworks
* event-driven programming
* modern frontend architecture

Even React’s event system and component trees have echoes of these older GUI patterns.
