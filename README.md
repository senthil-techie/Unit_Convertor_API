# Unit_Convertor_API

📏 Length Converter
Meter, Kilometer, Centimeter
⚖️ Weight Converter
Gram, Kilogram, Milligram, Pound
🌡️ Temperature Converter
Celsius, Fahrenheit, Kelvin
🎨 Modern UI
Glassmorphism design
Animated gradient background
Responsive layout
🔄 Form-based conversion
User inputs value
Selects units
Gets result instantly on same page

Backend: Spring Boot (Java)
Frontend: HTML, CSS, Thymeleaf
Build Tool: Maven
IDE: IntelliJ IDEA

UnitConverter/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/project/UnitConvertor/
│   │   │       └── Controller/
│   │   │           └── UnitController.java
│   │   │
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── index.html
│   │   │   │   ├── length.html
│   │   │   │   ├── weight.html
│   │   │   │   └── temperature.html
│   │   │   │
│   │   │   └── static/
│   │   │       └── css/
│   │   │           └── style.css
│   │   │
│   │   └── application.properties
│
└── pom.xml

🧠 How It Works
User selects a converter (Length / Weight / Temperature)
Enters value and selects units
Form submits request to Spring Controller
Backend processes conversion logic
Result is sent back and displayed on the same page

📌 Example
Input: 1000 cm → km
Output: 0.01 km

⚡ Instant conversion using JavaScript (no page reload)
📊 Data visualization (charts)
💾 Save conversion history (Database)
🌙 Dark/Light mode toggle
📱 Full mobile optimization

https://roadmap.sh/projects/unit-converter
