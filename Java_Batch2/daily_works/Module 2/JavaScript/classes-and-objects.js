class Employee
{
    id;
    name;
    email;
    dob;
    gender

    constructor(id, name, email, dob, gender)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.gender=gender;
    }

    printEmployee()
    {
        console.log(this);
    }
}

    class Manager extends Employee
    {
        managerId
        constructor(id, name, email, dob, gender, managerId)
        {
            super(id, name, email, dob, gender)
            this.managerId = managerId;
        }
    }
    
let emp = new Manager(101, 'Ansiya', 'ansi@email.com', '2000-02-26', 'female', 1001);
//console.log(emp)
emp.printEmployee();