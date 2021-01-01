# ApfsVisitorFileSystem
---- Program Description ----<br />

This program builds on the ApfsFileSystem program by introducing the ApfsVisitor interface to the /apfs<br />
package, which is implemented by the ApfsFileCrawlingVisitor, ApfsFileSearchVisitor, and ApfsCountingVisitor classes.<br />
The unique operations defined in the three visitor classes are decoupled from the file system elements<br />
that they interact with. The /fs package still contains the file system foundation classes, and other types of <br />
file systems like FAT32 or NTFS can added moduluary.

---- Compile & Run ----<br />

**_cd_** to **_/ApfsVisitorFileSystem_** and type **_ant -f build.xml_**.<br />

---- Prerequisite Steps & Environment Setup ----<br />

1. Install Ant from http://ant.apache.org/.
2. Configure your _ANT_HOME_ environment variable to reference the topmost directory of the Ant distribution.
3. Configure your _PATH_ environment variable to reference _ANT_HOME_ in a relative manner, by including _PATH=%ANT_HOME%\bin;_ for Windows or _PATH=$(ANT_HOME)/bin:_ for Linux.
4. Download the JUnit 5 JAR files from https://junit.org/junit5/.
5. Configure your _JUNIT_ environment variable to point to the directory containing those JAR files.

JUnit API JAR files:
* junit-jupitar-api.jar
* junit-jupitar-engine.jar
* junit-jupitar-params.jar
* apiguardian.jar
* opentest4j.jar

JUnit Platform JAR files:
* junit-platform-commons.jar
* junit-platform-engine.jar
* junit-platform.launcher.jar
* junit-platform-runner.jar:
* junit-platform-suite-api.jar
