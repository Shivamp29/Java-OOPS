# Reference Variable

  - A reference variable is Non-Prmitive type varible declared by using any one of the following type
      1. Class type reference Variable
      2. Interface type reference variable
      3. enum type reference variable

1. Class Type reference Variable :
   - 
     - A class type reference variable is declared by using the class name.
     - The class type reference variable is used to refer an object created in the heap memory
     - The class type reference variable is also known as " Object Reference "
     - Using the Object reference we can Access the members of an object  we can modify the data of an object
     - Any modification done using one object will not reflect in other object
     - A reference variable always contains an address of an object , if the reference variable is printed , then an object addresss will be printed.
     - One reference variable can be copied to anothe reference variable , if the both the reference variable types are same
     - ex. Check the program " CopyRefVariable.java "
     - An object in heap can be refered by multiple reference variables , in such cases the modification done using one object will be reflected in other object.
     - Consider the class name is Demo then class type refrence variable is declared as
     -     Demo d1 ;
     - Initialization
     -     d1 = new Demo() ;
     - Declaration and Initialisation at once
     -     Demo d1 = new Demo() ;
     - ex. check the program " ReferenceVariable.java "

# Types of reference variable 
  - There are 3 types of reference variables
      1. Local Reference Variable
      2. Static Reference Variable
      3. Non-Static Reference Variable


1. Local Reference Variable
    -
     - A reference variable which is declared inside the any Method body is known as Local Reference Variable
     - ex. check the program " LocalReferenceVariable.java "

2. Static Reference Variable
   -
     -  A reference variable which is declared inside the class with Static Keyword is known as Static Reference Variable
     -  static refrence variables can are accessed with the help of Class name
     -  ex. check the program " StaticReferenceVariable.java "
  
3. Non-Static Reference Variable
   -
     - A reference variable which is declared inside the class without Static Keyword is known as Non-Static Reference Variable
     - Non-Static refrence variables can are accessed with the help of an object
     - ex. check the program " NonStaticReferenceVariable.java "
   
