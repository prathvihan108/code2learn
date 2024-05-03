There can be only one public class or static class

##########################################################################################
Public class vs default class
##########################################################################################

The main difference between the public and default (also known as default or package-private) access modifiers in Java lies in their visibility and accessibility.

Visibility:

public: A class, method, or variable declared as public is visible and accessible from any other class or package. It has the highest level of visibility.
default: A class, method, or variable with default access (no access modifier specified) is visible and accessible only within the same package. It is not visible to classes in other packages.
Accessibility:

public: A public class, method, or variable can be accessed from anywhere in the codebase, including other packages.
default: A class, method, or variable with default access is accessible only within the same package. It is not accessible outside of the package in which it is declared.


##########################################################################################
what will be the difference when class variable are put public vs private vs protected as prefix to them
##########################################################################################
When it comes to class variables (also known as fields or attributes), using different access modifiers like `public`, `private`, and `protected` will determine their visibility and accessibility within the class itself and from other classes or subclasses. Here's an overview of the differences:

1. `public` class variable:
   - Visibility: A `public` class variable is visible and accessible from anywhere in the codebase, including other classes and packages.
   - Accessibility: Other classes and packages can access and modify the `public` class variable directly.

2. `private` class variable:
   - Visibility: A `private` class variable is only visible and accessible within the same class where it is declared.
   - Accessibility: Other classes and packages cannot access or modify the `private` class variable directly. To interact with it, you would typically need to provide public methods (getters and setters) within the class to control access to the variable.

3. `protected` class variable:
   - Visibility: A `protected` class variable is visible and accessible within the same package and in subclasses, regardless of the package they are in.
   - Accessibility: Other classes within the same package can access and modify the `protected` class variable. Subclasses in any package, even if they inherit from the original class, can also access and modify the `protected` class variable.

In summary:
- `public` class variables have the highest visibility and accessibility, being accessible from anywhere in the codebase.
- `private` class variables are only accessible within the same class, providing encapsulation and hiding implementation details.
- `protected` class variables allow access within the same package and in subclasses, enabling controlled sharing of variables with inherited classes.

It's important to note that encapsulation and data hiding are essential principles in object-oriented programming, and it is generally recommended to make class variables `private` or provide appropriate getters and setters for controlled access and modification. This helps maintain encapsulation and provides a level of abstraction.


##########################################################################################
public vs private vs default vs protected when used as suffix for class variables and class methods 
##########################################################################################


Access Modifier	within class	within package	outside package by subclass only  outside ppackage                          
public	            y               y               y                               y
protected	        y               y               y                               n
Default             y               y               n                              n
private	            y               n               n                               n

//notice: that:Even protected can be accessed within package directly by object,and also ouside the packge but only by subclasses

//private is accessible only within class directly

//Default is within the package ,but not outside of package or subclass too

//public accessible every where

//these rules are applicable for both class variables and class methods


##########################################################################################
Constructors in java
##########################################################################################
Constructors in Java : 
Constructors are similar to methods,, but they are used to initialize an object.

Constructors do not have any return type(not even void).

Every time we create an object by using the new() keyword, a constructor is called.

If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.

Rules for creating a Constructor ::

The class name and constructor name should be the same.

It must have no explicit return type.

It can not be abstract, static, final, and synchronized.






##########################################################################################
what will be the difference when class variable are put public vs private vs protected as prefix to them
##########################################################################################







##########################################################################################
what will be the difference when class variable are put public vs private vs protected as prefix to them
##########################################################################################







##########################################################################################
what will be the difference when class variable are put public vs private vs protected as prefix to them
##########################################################################################