# DevOps | Class Assignment 2 - Part 2

## Technical Report

### Part 2 - Build Tools with Gradle: Convert basic version of the Tutorial application to Gradle.

In this segment of the task, we'll be migrating the basic version of the Tutorial application from Maven to Gradle. This process entails establishing a fresh branch within your repository, titled tut-basic-gradle, which will solely cater to this particular phase of the assignment.

### Requirements

1. Create a new branch in your repository named tut-basic-gradle.
2. Start a new gradle spring boot project with the following dependencies: Rest Repositories, Thymeleaf, JPA and H2.
3. Extract the generated zip file into the folder "CA2/part2" of your repository. Then, check  the available gradle tasks.
4. Delete the src folder, and copy the src folder from the basic folder of the tutorial into the new folder.
   a. Copy the files webpack.config.js and package.json;
   b. Delete the folder src/main/resources/static/built/;
5. Add the gradle plugin org.siouan.frontend to the project.
6. Add "org.siouan.frontend-jdk17" version "8.0.0"
7. Configure the plugin in build.gradle.
8. Update the scripts section in package.json to configure the execution of webpack.
9. Add a task to gradle to copy the generated jar.
10. Add a task to gradle to delete all the files generated by webpack.

### Analysis

1. Create a new branch in your repository named tut-basic-gradle. This action pertains to managing version control via Git.
    * It serves to segregate alterations made during the migration procedure, thereby safeguarding the primary branch of the project from any potential impact.


2. Start a new gradle spring boot project with the following dependencies: Rest Repositories, Thymeleaf, JPA and H2. This task entails setting up a new Spring Boot project utilizing Gradle as the build tool.
    * These designated dependencies facilitate the development of RESTful APIs, the rendering of server-side HTML views, data persistence through the Java Persistence API (JPA), and utilize H2 as an in-memory database.


3. Unzip the generated file and transfer its contents into the directory "CA2/part2" within your repository. Subsequently, examine the assortment of Gradle tasks accessible.

    * This procedure encompasses unpacking the project files from the provided zip archive and assessing the spectrum of Gradle tasks at your disposal. Such examination aids in comprehending the build sequence within the new Gradle project.


4. Erase the "src" directory, then duplicate the "src" folder from the basic tutorial folder into the newly emptied directory.
    * This process entails substituting the source code of the fresh Gradle project with the source code derived from the fundamental version of the tutorial application.
    *

5. Incorporate the Gradle plugin org.siouan.frontend into the project.
    * This action entails integrating a Gradle plugin that furnishes functionalities to manage frontend resources within a Java project. The plugin facilitates the installation of Node.js and npm, along with executing npm and npx commands.


6. Include the dependency "org.siouan.frontend-jdk17" version "8.0.0".
    * This task entails defining the version of the frontend plugin to utilize. The version "8.0.0" has been verified for compatibility with JDK 17.


7. Customize the frontend plugin settings in the build.gradle file to align with project requirements.
    * This may include specifying the Node.js version, npm version, and defining scripts to execute.


8. Adjust the scripts section within package.json to configure webpack, a powerful static module bundler for JavaScript applications.
    * This ensures seamless integration and management of frontend assets.


9. Implement a Gradle task to facilitate the copying of the produced JAR file to a designated location.
    * This enhances the deployment and distribution workflow by simplifying the process of accessing the generated artifact.


10. Introduce a Gradle task designed to remove all files generated by webpack.
    * By incorporating this task into the build process, it ensures a clean environment before initiating subsequent builds, thereby minimizing potential conflicts and errors.


### Design

The migration process from Maven to Gradle for the basic version of the Tutorial application involves the following steps:

1. **Branch Creation**: Establish a new branch within the repository, named tut-basic-gradle. This branch serves to isolate the alterations made during the migration, preventing interference with the main branch.

2. **Project Initialization**: Initialize a fresh Spring Boot project utilizing Gradle as the primary build automation tool. Ensure that the project incorporates essential dependencies such as Rest Repositories, Thymeleaf, JPA, and H2.

3. **Project Setup**: Extract the contents of the generated zip file into the designated directory "CA2/part2" within the repository. Thoroughly examine the available Gradle tasks to comprehend the project's build lifecycle.

4. **Source Code Replacement**: Remove the src directory from the newly created Gradle project and replace it with the src directory obtained from the basic version of the tutorial application. Additionally, transfer the webpack.config.js and package.json files, while also deleting the src/main/resources/static/built/ directory.

5. **Plugin Integration**: Incorporate the Gradle plugin org.siouan.frontend into the project. This plugin offers functionalities to manage frontend resources efficiently within a Java-based project.

6. **Plugin Version Specification**: Specify the version of the frontend plugin to utilize. Ensure compatibility by selecting version "8.0.0," which is compatible with JDK 17.

7. **Plugin Configuration**: Configure the frontend plugin within the build.gradle file. Customize settings such as the Node.js version, npm version, and define appropriate scripts to execute.

8. **Webpack Configuration**: Update the scripts section in the package.json file to configure webpack's execution. This ensures seamless integration and operation of webpack within the project.

9. **Task Addition**: Introduce a new Gradle task responsible for copying the generated JAR file to a designated location. This task streamlines the deployment and distribution process, enhancing efficiency and organization.

10. **Cleanup Task Addition**: Implement a Gradle task designed to remove all files generated by webpack. This task promotes a clean and consistent build environment, minimizing potential conflicts or errors during subsequent builds.

### Implementation

Let's start by implementing the requirements for converting the basic version of the Tutorial application to Gradle. We will follow the steps outlined in the requirements and provide a detailed explanation for each step.

1. Create a new branch in your repository named tut-basic-gradle.

```bash
git branch tut-basic-gradle
git checkout tut-basic-gradle
```

2. Start a new Gradle Spring Boot project with the specified dependencies. Use https://start.spring.io/ to generate the project with the following dependencies:
* Rest Repositories
* Thymeleaf
* JPA
* H2

3. Extract the generated zip file into the folder "CA2/part2" of your repository. Then, check the available Gradle tasks.

* Commit and push the changes.

```bash
git add .
git commit -m "#14 Added extracted demo.zip to ca2/part2"
git push origin tut-basic-gradle
```

4. Check the available gradle tasks:

```bash
./gradlew tasks
```

5. Delete the src folder.

```bash
cd CA2/part2
rm -r src
```

6. Copy the src folder from the basic folder of the tutorial into the new folder.

```bash
cp -r path/to/basic/src CA2/part2
```

7. Copy the webpack.config.js

```bash
cp ../../ca1/basic/webpack.config.js CA2/part2
```

8. Copy the package.json

```bash
cp ../../ca1/basic/package.json CA2/part2
```

9. Delete the folder src/main/resources/static/built/

```bash
rm -r src/main/resources/static/built
```

* Commit and push the changes.

```bash
git add .
git commit -m "#15 Deleted src folder and copied webpack.config.js and package.json of CA1/basic folder. Next deleted build folder in CA2/part2"
git push origin tut-basic-gradle
```
10. Before running the application you have to do the following changes:

* In the class Employee.java change the following imports, where is used javax. change to:

```java
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
```

* In the build.gradle file, add the following plugin dependencies:

```gradle
plugins {
	id 'java'
	id 'org.springframework.boot' version '3.2.4'
	id 'io.spring.dependency-management' version '1.1.4'
	id "org.siouan.frontend-jdk17" version "8.0.0"
	id 'com.github.node-gradle.node' version '3.1.1'
}
```
Now run the application:

```bash
./gradlew bootRun
```

* Commit and push the changes.

```bash
git add .
git commit -m "#17 added plugin to gradle build closes#17"
git push origin tut-basic-gradle
``` 

11. In order to configure the plugin in build.gradle, add the following configuration:

```gradle
frontend {
	nodeVersion = "16.20.2"
	assembleScript = "run build"
	cleanScript = "run clean"
	checkScript = "run check"
}
```
* Commit and push the changes.

```bash
git add build.gradle
git commit -m "#18 Added code to build.gradle frontend closes#18"

git push origin tut-basic-gradle
```

12. Update the scripts section in package.json to configure the execution of webpack.

```json
 "scripts": {
    "webpack": "webpack",
    "build": "npm run webpack",
    "check": "echo Checking frontend",
    "clean": "echo Cleaning frontend",
    "lint": "echo Linting frontend",
    "test": "echo Testing frontend"
  }
```

* Commit and push the changes.

```bash
git add package.json
git commit -m "#19 Updated package.json with new scripts closes#19"
git push origin tut-basic-gradle

```

* Add the following configuration in the package.json file, before the scripts:

```json
  "packageManager": "npm@9.6.7",
```

* Commit and push the changes.

```bash
git add package.json
git commit -m "#20 added packageManager to package.json"
git push origin tut-basic-gradle
```

13. Now you can build the project, and the run the application using the following commands:

```bash
./gradlew build
./gradlew bootRun
```

Here is the frontend of the application:

![img.png](img.png)

14. Add a task to Gradle to copy the generated jar into a folder named "dist" located at the project root folder level.

```gradle 

task copyJarToDist(type: Copy) {
	from 'build/libs/' 
	into 'dist'
	include '*.jar' 
}
```
* Commit and push the changes.

```bash
git add build.gradle dist
git commit -m "#21 added task copyJarToDist in build.gradle closes#21"
git push origin tut-basic-gradle 
```

15. Add a task to Gradle to delete all the files generated by webpack.

```gradle
task deleteWebpackFiles(type: Delete) {
	delete 'src/main/resources/static/built/'
}

clean.dependsOn deleteWebpackFiles
```
* Commit and push the changes.
```bash 
git add build.gradle
git commit -m "#22 added task to delete built folder closes#22"
git push origin tut-basic-gradle
```

16. Close the branch and merge to the main branch.

```bash 
git checkout main
git merge --no-ff tut-basic-gradle 
```

17. Mark the repository with the tag ca2-part2.

```bash
git tag ca2-part2
git push origin ca2-part2
```

### Conclusion

This report outlines the successful migration of the Tutorial application from Maven to Gradle, employing a systematic approach. The migration process involved creating a dedicated branch, setting up a Spring Boot project with Gradle, and transitioning from Maven-centric configurations to Gradle equivalents. By incorporating essential plugins and tasks, we streamlined the project's execution and administration, ensuring a seamless transition to Gradle.

