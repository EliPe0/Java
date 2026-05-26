# Java Console Output Exercise

## 📌 About the Project

This project is a simple Java exercise created to practice basic programming logic and console output formatting.

It focuses on:

* Variable declaration
* Data types
* String formatting
* Console output using `System.out.printf`

---

## 🚀 Features

* Displays product information with formatted prices
* Prints personal record data (age, code, gender)
* Demonstrates decimal formatting with different precision levels
* Shows how to change locale settings for number formatting

---

## 🛠️ Technologies Used

* Java (JDK 8+)
* Standard Java libraries (`java.util.Locale`)

---

## 📂 Project Structure

```
.
└── App.java
```

---

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/your-repository.git
```

### 2. Navigate to the project folder

```bash
cd your-repository
```

### 3. Compile the code

```bash
javac App.java
```

### 4. Run the program

```bash
java App
```

---

## 💡 What This Project Demonstrates

### 📊 Output Formatting

* `%s` → String
* `%d` → Integer
* `%.2f` → Decimal with 2 places
* `%n` → New line

### 🌎 Locale Usage

The project uses:

```java
Locale.setDefault(Locale.US);
```

This ensures that decimal numbers use a dot (`.`) instead of a comma.

---

## 🧪 Example Output

```
Products:
Computer, which price is $ 2100.00
Office desk, which price is $ 650.50

Record: 30 years old, code 5290 and gender: F

Measure with eight decimal places: 52.23456700
Rounded (three decimal places): 52.235
US decimal point: 52.235
```

---

## 🎯 Learning Purpose

This project was developed as part of a beginner Java course to improve:

* Logical thinking
* Understanding of basic syntax
* Console-based output formatting

---

## 🔮 Possible Improvements

* Accept user input instead of hardcoded values
* Organize code into methods
* Add comments in English for consistency
* Expand into a small product management system

---

## 👨‍💻 Author

Developed for learning purposes.
