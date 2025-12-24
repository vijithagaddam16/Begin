# sample-app

A minimal Java 17 Maven project (Hello World) with a small unit test using JUnit 5.

Prerequisites
- Java 17 JDK installed and on PATH
- Apache Maven installed and on PATH

Build
Open PowerShell in the project root (this folder) and run:

```powershell
mvn -v
mvn -DskipTests=false test
mvn package
```

Run
After `mvn package` you can run the JAR produced by Maven:

```powershell
java -cp target\sample-app-1.0-SNAPSHOT.jar com.example.App "YourName"
```

Notes
- The project uses Java 17 (release 17) and JUnit Jupiter 5 for tests.
- If Maven is not available, you can run tests and compile using an IDE that supports Maven (e.g. VS Code + Java extensions).
