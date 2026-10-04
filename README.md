# Assignment #3 — Bridge Design Pattern

**Course:** ShP-2216 – Software Design Patterns (OP 6B06102)  
**Institution:** Astana IT University — School of Computer Engineering  
**Student Name:** [Ваше Имя и Фамилия]  
**Group:** [Ваша группа, например, SE-2201]

---

## 1. Overview
This project implements the **Bridge** structural design pattern in **Java (JDK 17)**. The pattern is used to decouple an abstraction from its implementation so that the two can vary independently.

We chose **Option A (Shape–Renderer)**:
* **Abstraction Hierarchy (`Shape`):** Represents geometric figures (`Circle`, `Square`) that high-level clients interact with.
* **Implementor Hierarchy (`Renderer`):** Represents low-level drawing engines (`VectorRenderer`, `RasterRenderer`) that handle rendering specifics.

---

## 2. Project Structure
```text
BridgePatternDemo/
└── src/
    └── com/
        └── aitu/
            └── designpatterns/
                └── bridge/
                    ├── renderer/
                    │   ├── Renderer.java (Implementor interface)
                    │   ├── VectorRenderer.java (Concrete Implementor)
                    │   └── RasterRenderer.java (Concrete Implementor)
                    ├── shape/
                    │   ├── Shape.java (Abstraction)
                    │   ├── Circle.java (Refined Abstraction)
                    │   └── Square.java (Refined Abstraction)
                    └── Main.java (Client demonstration)