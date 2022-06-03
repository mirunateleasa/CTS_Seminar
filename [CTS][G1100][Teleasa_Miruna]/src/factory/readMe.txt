The application considers as an object an Organization Employee. The Employee can be of different types (Manager, Case Admin, Case Worker), but can be created
in a centralized way. If it happens that a new type of Employee appears (an Assitant Manager, for example), the classes have to be implemented without changing the
initial code. 

I chose to implement this with a Factory Method because we need to create objects from the same superclass (Employee) and because we can add new employee types and we 
cannot change the code