# 🩸 Blood Bank Management System

This repository contains a simple **Blood Bank Management System** built using **Java**, **HTML**, **CSS**, and **JavaScript**, with data stored in an **SQL Database**. It's designed to help manage blood donations and availability effectively.

---

## 📁 Project Structure

```
lakshitamudgal-blood-bank-management/
├── README.md
├── build.xml
├── LICENSE
├── nbproject/
├── src/
│   └── java/
│       └── abcd/
│           └── my.java
├── web/
│   └── *.jsp, *.html
```

---

## 🛠️ Tech Stack

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (Servlets/JSP)
- **Database**: SQL (e.g., MySQL)
- **Build Tool**: Apache Ant
- **IDE**: NetBeans (recommended)

---

## 🚀 How to Run the Project

> 💡 _Recommended IDE: NetBeans (supports Ant build projects natively)_

### 1. Clone the Repository

```bash
git clone https://github.com/lakshitamudgal/lakshitamudgal-blood-bank-management.git
cd lakshitamudgal-blood-bank-management
```

### 2. Set Up the Database

- Create a new database in MySQL (or your preferred RDBMS).
- Import the relevant `.sql` file (if available), or manually create the tables needed for donor, blood stock, etc.
- Update DB credentials in the Java files if necessary.

### 3. Open in NetBeans

- Open NetBeans IDE.
- Go to `File > Open Project` and select the `lakshitamudgal-blood-bank-management` folder.
- NetBeans will automatically detect the Ant project via `build.xml`.

### 4. Configure Server

- Use **Apache Tomcat** (version 9+ recommended).
- Right-click the project > `Properties` > `Run` > choose your Tomcat Server.

### 5. Build and Run

- Right-click the project > `Clean and Build`.
- Then right-click again > `Run`.
- Your browser should open the app (e.g., at `http://localhost:8080/lakshitamudgal-blood-bank-management/`).


---

## 📄 License

This project is licensed under the terms of the MIT License. See the [LICENSE](./LICENSE) file for details.

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to change.

---

## 💬 Contact

For questions, feel free to reach out via GitHub Issues or contact [Lakshita Mudgal](https://github.com/lakshitamudgal).
