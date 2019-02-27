EXPLANAITION;
Builder design pattern is a part of creational design pattern where creation of objects become simpler.
When creating the parameterized object this pattern has the flexibility of not including parameter of that object without any error.
it seperates the construction of compplex objects from where it represents.

PATTERN IMPLEMENTATION;
there should be two classes of outer and builder.
there should be a copy of all the arguments from outer to builder class.
there should be a public constructor in builder class which should have all the arguments as parameters.
builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
there is also another method where it returns the object needed.
