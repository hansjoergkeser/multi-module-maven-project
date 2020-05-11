# multi-module-maven-project

Tests of module a and b use implementation from module c

Execute all tests of all sub modules in terminal:<br>
mvn test

Be aware that the order of the modules declared in the root pom is important for the build lifecycle.<br>
Here module c contains necessary code for the other modules, hence module c has to be the first module in the pom:


    <modules>
        <module>module-c</module>
        <module>module-a</module>
        <module>module-b</module>
    </modules>

The module that wants to use code from anther module has to implement the dependency
e.g. module a wants to use something from module c then<br>
module a has to implement

        <dependency>
            <groupId>org.example</groupId>
            <artifactId>module-c</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>test</scope>
        </dependency>
        
in the dependencies section of the Module A pom file.
Avoid circular dependencies. 

If a class can still not be found make sure you have the same package structure in both mdules.
E.g.

module a -> ClassAWithAnotherUtils in<br>
package some.domain.to.demonstrate.how.important;<br>
implements MyUtilsClass from module c

module c -> MyUtilsClass is in<br>
package some.domain.to.demonstrate.how.important

If you encounter the problem during continuous integration, e.g. Jenkins build, <br>
that the c module as artifact dependency could not be found in your nexus/artifactory/maven central<br>
then you have to make sure the command <br>
--also-make<br>
is added to your mvn command

see https://maven.apache.org/guides/mini/guide-multiple-modules.html

e.g.<br>
mvn test -pl module-a --also-make

with -pl you choose to execute the test of module a only, and --also-make makes sure the necessary module c dependency is also available.
