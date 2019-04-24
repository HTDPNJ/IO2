package Others;

import java.io.Serializable;
/*空接口只是个标识*/
public class Employee implements Serializable
{
    private transient String name;
    private double salary;
    public Employee()
    {
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
