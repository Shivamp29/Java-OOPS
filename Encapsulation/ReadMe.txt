Encapsulation :

    - Binding data and it's Related Information into single entity or class is known as encapsulation.
    - Encapsulation Specifies that hide the data and Realted Infromation by using the specific access specifier.
    
    - ex of encapsulation are :

        1. class is an Encapsulation of the Data Members & Member Functions.
        2. Package is an encapsulation of the Classes.
        3. Project is an encapsulation of the Packages

    - Using an encapsulation We achieve " Data Hiding "

Data Hiding : 

    - Data Hiding is nothing but hiding the information to secure a data so that other can not have access to the data
    - for ex.
                In case of Instagram account 
                    the email & password cand be shown to the user only not for everyone  &
                    it can only modified by the user others cannot modify it.

    - Data Hiding is achieved by applying private access specifiers to the Data Fields
    - & to access the private data fields we must have ' Getters & Setters '

    - Getters :
            - getters are used to access the private data fields.
            - getters are also called as ' Accessers '
            - getters must have have ' public ' access specifier.
            - getters have the same return type as the type of attribute
            - getters doesn't have any parameter i.e. No parameter
            - Syntax :

                    public returnType getAttributeName ( )
                    {
                        return AttributeName ;
                    }

    - Setters :
            - setters are used to modify the values of private data feilds.
            - setters are also called as  " Mutators "
            - seeters must have ' public ' access specifier.
            - return type of setters is ' void '
            - setters take one parameter
            - Syntax :

                    public void SetAttributeName ( Datatype AttributeName )
                    {
                        this.AttributeName = AttributeName ;
                    }


Java Beam Class :

    - if we wanted to say one class is Java Beam Class then that class must follow the bellow specification 

            1. A class must be public
            2. A class must have the private data fields
            3. A class must have public getters & setters to access & modify the private fields
            4. A class must have a public Constructor

    - ' Java Beam Class ' is an very good example of an Encapsulation





        
    


