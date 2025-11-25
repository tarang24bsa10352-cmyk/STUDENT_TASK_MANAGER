Student Daily Task Tracker

The Student Daily Task Tracker is a console-based Java application designed to help students manage their daily academic tasks. It provides a simple menu-driven interface that allows users to add, delete, update, sort, and save tasks to a text file for later use.

Features

Add new tasks

Delete existing tasks

Mark tasks as completed

Display all tasks in a structured format

Sort tasks alphabetically by title

Save tasks to a text file

Automatically load tasks when the program starts

Project Structure
Student-Task-Tracker/
│
├── Task.java
├── TaskManager.java
├── Main.java
└── tasks.txt 

File Descriptions
Task.java

Defines the Task entity with:

Title

Completion status

Methods to update and display task state

TaskManager.java

Handles:

Adding, deleting, and updating tasks

Sorting

Saving to and loading from file

Displaying tasks in list format

Main.java

Provides a simple interactive menu for user input and executes operations through TaskManager.

How to Run
Using IntelliJ IDEA

Create a new Java project

Add the files: Task.java, TaskManager.java, and Main.java

Run Main.java

Using Command Line
javac Task.java TaskManager.java Main.java
java Main

Data Storage

Tasks are stored in a text file named:

tasks.txt


Each line stores:

TaskTitle,isCompleted


The file loads automatically when the program starts.

Main menu

Adding a task

Displaying tasks

Marking a task completed

Sorted task list

tasks.txt file content

Exit screen

Name:Tarang Gupta
24BSA10352
