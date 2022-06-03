Any case can have 3 different states according to its progress:
	- newly reported 
		- it means that it has just been reported and no admin or worker has taken it
		- it cannot be worked on or finished because it hasn't been taken yet
		- it can only be started
		- it's the entry state when it's created
	- in progress
		- it means that an admin has taken it and it's currently working on it
		- it cannot be started again, because it's already started 
		- it can be worked on with a certain amount of funds or it can be finished
	- solved
		- it means the case has been already finished by an admin
		- it cannot be started again because the problem is solved
		- it cannot be worked on because it's already solved
		- it's the final state of a case
		
I used a state pattern to implement this because I have to manage different behaviours of the case object based on its progress and condition.
							