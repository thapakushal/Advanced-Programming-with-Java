# Advanced Programming with Java (Pokhara University Coursework) ☕

Welcome to my central Java development archive. This repository tracks my entire engineering laboratory curriculum, practical assignments, and distributed systems applications built for the **Advanced Programming with Java** undergraduate engineering course.

All implementations are developed natively on **Fedora Linux** using **Apache NetBeans IDE**.

---

## 🚀 Active Project: Addition GUI Application
My introductory implementation showcases programmatic Desktop UI building using **Java Foundation Classes (JFC)**.

### Key Mechanical Implementations:
* **Manual Layout Control:** Uses absolute component mapping (`setLayout(null)`) via precise vector bounds allocation (`setBounds()`).
* **Decoupled Event Handling:** Implements `ActionListener` and overrides `actionPerformed(ActionEvent)` to interface logic seamlessly with user actions.
* **Data Stream Preparation:** Configured with advanced `java.awt.dnd.*` and `DataFlavor` components to integrate asynchronous Drag-and-Drop file processing protocols.

---

## 🗺️ Academic Syllabus Roadmap & Progress Index
This index tracks my progress against the official university curriculum milestones:

### 🗲 Completed Fundamentals & UI Systems
* [x] **Unit 1 & 2: OOP & Core Architecture** — Classpaths, Object instantiation, Custom Exception Handling structures, and Java Collections Framework abstractions.
* [x] **Unit 3: Graphical Component Engineering** — Structural layouts, Frame containers, and AWT/Swing interface listener architectures.
* [ ] **Unit 4: Distributed Network Infrastructure** — Multi-threaded Client-Server interaction utilizing TCP/UDP Socket bindings, custom RMI (Remote Method Invocation) configurations, and CORBA architectures.
* [ ] **Unit 5: Enterprise Database Integration (JDBC)** — Persistence management layers via structural JDBC Drivers, stateful SQL statement parsing, prevention of SQL Injection vulnerabilities via `PreparedStatement`, and atomic transaction commits.
* [ ] **Unit 6: Java Web Architectures (Servlets & JSP)** — Lifecycle control loops for Web Servlets, asynchronous HTTP request handling (GET/POST), dynamic view composition with JavaServer Pages, and state persistence with session-bound Cookies.
* [ ] **Unit 7: Advanced Cloud Frameworks** — Object-Relational Mapping (ORM) design patterns using Hibernate, Dependency Injection configurations using Spring Boot, and critical safe concurrency optimizations.

---

## 📂 Repository Structural Mapping
```text
Advanced-Programming-with-Java/
├── 📁 Unit-03_Swing_&_JavaFX/
│   └── 📁 AdditionGuiProject/
│       ├── 📁 src/
│       │   └── 📁 gui_app/
│       │       └── 📄 AdditionGuiApp.java
│       └── 📄 nbproject/          # NetBeans project configuration
├── 📁 Unit-04_Network_Sockets/    # (Upcoming Pipeline)
├── 📁 Unit-05_JDBC_Database/      # (Upcoming Pipeline)
├── 📁 Unit-06_Servlets_&_JSP/     # (Upcoming Pipeline)
└── 📄 README.md
