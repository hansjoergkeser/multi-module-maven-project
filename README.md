# multi-module-maven-project

tests of module a and b use implementation from module c

the module that wants to use code from anther module has to implement the dependency
e.g. Module A wants to use something from Module C then<br>
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