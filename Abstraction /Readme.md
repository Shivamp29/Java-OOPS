# Abstraction : 

  - Abstraction is nothing but ' hiding an implementation and showing only the functionalities to the user ' is known as Abstraction
  - In another way show only the functionalities and hide an implementation details so that an implementation  details aree not exposed to the user

  - Abstaction can be achieved in two way
      1. By using Abstract class
      2. By using an Interface

**- Steps to achieve abstraction using an Abstract class :**
  1. define the functionality in Abstract class  with the help of abstract methods which are shown to the user
  2. Define the class which provides the body for an abstract method by extending an abstract class
  3. Create an abstract class type reference variable and assign the implementation class object to that variables..
  4. ex. check the program ' AbstractionUsingAbstractClass.java '

**- Steps to achieve Abstraction using an Interface class :**
  1. Define the functionality in an Inteface with the help of methods which are shown to the user
  2. Define an implementation classes which must provides the body for all the abstract methods of an interface
  3. Refer an implementation class object by using an interface type reference variable
  4. ex.  check the program ' AbstractionUsingInterface.java '


**_- Real Word Example of an Abstraction is :_**

- Example 1 :
  
  - ATM Machine is one of the good example of an Abstraction
  - In case of ATM machine we are using the only functionalities like Withdraw Balance , Check balance , Mini Statament , Deposite Money , etc we don't know an internal implementation of these functionaliaties
 
- Example 2 :

  - All the Interfaces of JDBC API's is good example of an Abstraction
  - because we don't know an implementation of that interface , just we use that interface to Perform an JDBC operations.
    
    

