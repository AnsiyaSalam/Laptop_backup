package ABC;

class Employee {
    String name;
    int age;
    int experience;
    double salary;
    String department;
	
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int experience, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", experience=" + experience + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
    
    

   
}

