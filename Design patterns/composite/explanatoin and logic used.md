COMPOSITE PATTERN EXPLAINATION;
When we need to create a structure in a way that the objects in the structure has to be treated the same way.
There are two components like composites and leaf.
where leafs are parts of composites and composites are part of other comosite displaying tree structure.


LOGIC BEHIND THE CODE;
the code is about displaying the name and prize of the object where only leaves have prize and are parts of composites.
so ive created an interface implemented by two classes .
the object created by leaf class are instancited in main class and they've been passed as parameter to composite objects by the add method from list which is been created in composite class.
and also the composite objects could be passed in as parameters for another composite objects.
