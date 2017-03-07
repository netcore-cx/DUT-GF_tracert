#!/bin/bash
javac InterfaceMac.java
javac InterfaceActive.java
javac InterfaceOrdi.java
javac Machine.java
javac Router.java
javac Ordi.java
javac Switch.java
javac AccessPoint.java
javac Frame.java
javac MainFrame.java

chmod 744 ./*class
java MainFrame

rm -f *.class
