EXPLANATION;
this pattern restricts instanciation of class inly once

CODE LOGIC;
in this code double lock is used where the confirmation of instance created is checked twice.
the class singleton containing a method getInstance() checked for existing instance by descision making.
in this method getInstance() containing synchronized key word where it only allows one thread at a time and blocks all other threads.
by this we could be so sure of one instance created.
