@echo off
set workspace=C:\Users\bm0819\Desktop\SPAI\WORKSPACE_ECLIPSE\Raquel.Diaz.ecp1.miw.upm.es
set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_51\bin;C:\Users\bm0819\Desktop\SPAI\SOFTWARE\apache-maven-3.3.3-bin\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_51
set M2_HOME=C:\Users\bm0819\Desktop\SPAI\SOFTWARE\apache-maven-3.3.3-bin\apache-maven-3.3.3
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo .
echo ===== mvn clean test ====
echo .
call mvn clean test
pause