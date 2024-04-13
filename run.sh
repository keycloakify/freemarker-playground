#!/bin/bash

javac -cp "lib/*" src/main/java/Main.java -d .
java -cp ".:lib/*" Main

