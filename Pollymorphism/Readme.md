# Pollymorphism

 - An object showing the different behaviours at different stages of an object is known as polymorphism 
	
 - There are two types of polymorphism :
	1. Runtime polymorphism 
	2. Compiler time polymorphis

1. Compile time pollymorphism :
   	- In compile time pollymorphism the method declaration is binded to its method body by the compiler at the time of compilation is known as compile time pollymorphism.
   	- Since the binding happens at the compilation time then it is known as " Early Binding "
   	- Once binding is done by the compiler it can cannot be rebinded  hence it is also known aa " Static Binding "
   	- Method overloading is used to achieve the compile time polymorphism.
   	- In the method overloading binding of methods is dine on the basis of parameter list
   	- The methods which cannot be overridden the compiler performs the binding.
   	- ex. check program ' CalculatorMainclass.java '

2. Run Time Polymorphism :
   	- In run time polymorphism the method declaration is binded  to its method body By the JVM during the execution time
   	- Since the binding happens at runtime then it is also called as " Late Binding "
   	- Once binding is done by the JVM , then it can be rebinded again , hence it is also known as " Dynamic Binding "
   	- Method overriding is an example of run time polymorphism.
   	- In case of method overriding the binding of methods happens based on an Object.
  
   	- To achieve the run time polymorphism , the program should contains the
   	  	- Is-a relationship
   	  	- Method overriding
   	  	- Upcasting
   	  	- Generalisation
