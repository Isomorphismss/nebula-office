# Nebula Office - Enterprise Productivity Suite
## 🌟 Introduction
Nebula Office is a modern **enterprise productivity platform** that integrates **attendance tracking, meeting management, document collaboration, and workflow automation** into a seamless experience.

## ✨ Features

- 🔐 **Facial Recognition Attendance**
   - Employees can check in using **facial recognition**.
   - **GPS tracking & email notifications** ensure accuracy.

- 📅 **Meeting Management**
   - Schedule and manage **multi-user video conferences**.
   - Powered by **Tencent Cloud TRTC**.

- 📂 **Cloud Document Collaboration**
   - Store and edit documents in **Tencent Cloud Object Storage**.
   - Support for **real-time collaboration**.

- 🏢 **Workflow Automation**
   - Automate approvals for **meetings, expenses, purchases, and leave requests**.
   - Powered by **Activiti7 workflow engine**.

- 🔔 **Smart Notifications**
   - Receive **reminders, weekly reports, and timeout alerts**.
   - Async announcements are sent using **RabbitMQ**.

## 🚀 Getting Started

### 1️⃣ Prerequisites
Before starting the backend, ensure the following services are running:

- **JDK 17+**
- **Docker**
- **MySQL**
- **MongoDB**
- **Redis**
- **RabbitMQ**
- **Tencent Cloud Object Storage**
- **Tencent Cloud TRTC**

### 2️⃣ Installation

Clone the repository:
```sh
git clone https://github.com/Isomorphismss/nebula-office.git
cd nebula-office
```

Install dependencies and build:
```sh
mvn clean install
```

### 3️⃣ Run Required Services

#### **📸 Start Facial Recognition Service (Docker)**
```sh
docker run -d -p 5000:5000 nebula-face-recognition
```
⚠️ **Ensure the service is running before using the attendance feature.**

#### **⚙️ Start Activiti7 Workflow Engine**
```sh
cd /libs/nebula-workflow
java -jar nebula-workflow.jar
```

#### **🚀 Start Backend**
```sh
mvn spring-boot:run
```

## 📝 Notes

- **Database setup**: Ensure MySQL, MongoDB, and Redis configurations are correctly set in `application.yml`.
- **Tencent Cloud setup**: Make sure credentials for **TRTC and Object Storage** are correctly configured.
- **RabbitMQ must be running** for async notifications to work.


## 📜 License
This project is licensed under the **MIT License**.
