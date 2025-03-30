# Maven
Maven is a popular, open-source build automation and project management tool, primarily used for Java-based applications, that simplifies the build process by automating tasks like compilation, dependency management, and packaging. 

## Here's a more detailed explanation:
Build Automation:
Maven automates the source code compilation, dependency management, and packaging of Java projects. 

## Project Management:
It helps manage projects by providing a standard directory layout and a default build lifecycle, streamlining the build process. 

## Dependency Management:
Maven automatically downloads and manages project dependencies (libraries, frameworks, etc.) from a central repository, simplifying the process of including external code in your project. 

## Project Object Model (POM):
Maven uses a POM, an XML file, to define the project's structure, dependencies, and build configurations. 

## Plugins:
Maven has a plugin architecture, allowing developers to extend its functionality with plugins for tasks like code coverage, static analysis, and more. 

## Standardized Build Process:
Maven provides a standardized build process, making it easier for developers to understand and work with projects, regardless of their size or complexity. 

## Maven Lifecycle Phases
### Default lifecycle phases
validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
### Clean 
clear the old build project
### site
Helps to create web documentation
## Maven Installation Process
to install maven Java is required
install Java in --> jenkins & nodes
```
    sudo apt-get update
    sudo apt-get install openjdk-17-jdk -y
```
## maven install
```
sudo apt install maven -y
mvn -version
```
### Creating a project
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=myproject
```
ls -a
cd myproject/
sudo apt-get install tree -y
tree
cd studentapp.ui/

### maven command to project build
```
mvn validate
mvn package
mvn clean
mvn clean package

