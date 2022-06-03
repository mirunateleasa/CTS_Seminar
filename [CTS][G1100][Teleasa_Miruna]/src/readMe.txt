My license application implements a platform for Non-Governmental Organizations (like Red Cross or UNICEF) that allow them to 
manage their employees (Case Workers, Case Administrators and Managers) and the cases they work on. Also, the platform allows normal civilians (that have no relation to the
Organization) to report social cases they know or they are involved with, without having to directly contact the organization. Thus, the application uses the following objects:
	- Organization
	- Application User that can be
			- Organization Employee that can be
					- Manager (manages all employees for a certain organization)
					- Case Administrator (manages a certain case and the workers that work on it)
					- Case Worker (works to solve a case)
			- Civilian that can be
					- Anonymous (doesn't have an account in the application)
					- Registered (has an account in the application)
	- Social Case