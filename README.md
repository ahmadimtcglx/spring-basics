# Spring Basics
why we use spring?
- to make our app configurable.It uses the  ides of "inversion of control and dependency injection".

Spring IOC(Inversion of control)-It means, rather than we creating the java objects spring will create the object.
		We use it for- craeting object for us.
			     - managing our objects.
			     - helping our application to be configurable ang managing dependencies.

Spring beans:In spring terminology ,java object is called bean. The java objects that are stored in container are 
	called beans.

Spring containers: is the core of spring framework.use for creating the object and configure them.

there are 2 types of container-
(Both are interfaces)
1.Bean factory
2.Application Contex  : Advance version -mostly we use this. to implenent this we use 
"classPathXmlApplicationContex" class.

config file - we write its name to classPathXmlApplicationContex class. which containes class name of which 
	we want to create object.
      In my code "beans.xml" is config file.


