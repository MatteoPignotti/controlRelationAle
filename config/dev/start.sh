#!/bin/bash
PROJECT="dev"
JAVA_HOME="C:\Program Files\Java\jdk1.8.0_221\bin"
CLASSPATH="C:\Users\Matte\OneDrive\Desktop\controlRelation\target\controlRelation-1.0-SNAPSHOT.jar;C:\Users\Matte\OneDrive\Desktop\controlRelation\jar\*"
MAINCLASS="it.nexi.control_relation.batch.App"
ARGUMENTS="C:/Users/Matte/OneDrive/Desktop/controlRelation/config/dev/application.properties C:/Users/Matte/OneDrive/Desktop/controlRelation/config/dev/log4j.properties"
java -cp $CLASSPATH it.nexi.control_relation.batch.App $ARGUMENTS
