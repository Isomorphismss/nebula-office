# Nebula Office

## Overview
**Nebula Office** is an online office platform 
designed to enhance enterprise productivity by 
providing a comprehensive suite of tools for 
attendance tracking, meeting management, document 
collaboration, and workflow automation. The backend 
is built with **Spring Boot**, 
supporting features like facial recognition attendance, GPS location tracking, multi-user video conferencing, cloud document storage, and automated approval workflows.

---

## Features
- **Facial Recognition Attendance**: Employees can check in using facial recognition, with GPS location tracking and automated email notifications to managers.
- **Meeting Management**: Schedule and manage meetings with integrated multi-user video conferencing powered by Tencent Cloud TRTC.
- **Cloud Document Collaboration**: Store and manage documents in Tencent Cloud Object Storage, enabling real-time collaboration.
- **Online Approvals**: Automate approval workflows for expenses, purchases, and other requests using **Activiti7**.
- **Notifications**: Send weekly reports, reminders, and timeout alerts using **Quartz** scheduling.
- **System Notifications**: Asynchronously send announcements via **RabbitMQ** to reduce MongoDB write pressure.

---

## Technologies
- **Framework**: Spring Boot
- **Database**: MySQL, MongoDB
- **Authentication**: Shiro, JWT
- **Messaging**: RabbitMQ
- **Scheduling**: Quartz
- **Storage**: Tencent Cloud Object Storage
- **APIs**: RESTful APIs with Swagger2 documentation
- **DevOps**: Docker
- **Workflow Engine**: Activiti7
- **Video Conferencing**: Tencent Cloud TRTC
- **Face Recognition**: OpenCV + Flask (deployed in Docker)

---

## Prerequisites
Before running the backend services, ensure the following are installed and configured:
1. **Java**: JDK 17+ (required for the Activiti7 workflow engine).
2. **Docker**: For running the facial recognition service (OpenCV + Flask).
3. **MySQL**: Database for structured data.
4. **MongoDB**: Database for unstructured data (e.g., notifications, logs).
5. **RabbitMQ**: Message broker for asynchronous communication.
6. **Redis**: For caching and token management.
7. **Tencent Cloud**: For storing large files (e.g., images, documents), and for video conference.

---

## Getting Started

### Step 1: Set Up Databases and Middleware
1. **MySQL**:
    - Create a database named `nebula_office`.
    - Update the connection details in `application.yml`.
2. **MongoDB**:
    - Ensure MongoDB is running and accessible.
    - Update the connection details in `application.yml`.
3. **RabbitMQ**:
    - Install and start RabbitMQ.
    - Update the connection details in `application.yml`.
4. **Redis**:
    - Install and start Redis.
    - Update the connection details in `application.yml`.
5. **Tencent Cloud Object Storage**:
    - Set up a bucket and obtain access credentials.
    - Update the connection details in `application.yml`.

---

### Step 2: Run the Facial Recognition Service
TODO

---

### Step 3: Run the Workflow Engine (Activiti7)
1. Ensure JDK 17+ is installed.
2. Navigate to the directory containing the Activiti7 JAR file:
   ```
   cd /libs/nebula-workflow
   ```
3. Run the Activiti7 JAR:
   ```
   java -jar nebula-workflow.jar
   ```
4. Ensure the service is running and accessible.

---

### Step 4: Run the Backend Services
1. Clone the repository:
   ```
   git clone https://github.com/Isomorphismss/nebula-office
   ```
2. Navigate to the project directory:
   ```
   cd nebula-office
   ```
3. Build the project:
   ```
   mvn clean install
   ```
4. Run the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

---

## Notes
- Ensure all prerequisite services (**MySQL, MongoDB, RabbitMQ, Redis, Tencent Cloud Object Storage**) are running before starting the backend.
- Make sure the required SDKs (mostly from Tencent) are placed in the correct folder.
- The facial recognition service must be running in Docker for attendance features to work.
- The Activiti7 workflow engine requires JDK 17+ and must be running for approval workflows to function.
- Update all connection details in `application.yml` to match your local or remote configurations.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.