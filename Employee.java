package EX11_02;

public class Employee extends Person{

    private String office;
    private int salary;
    private String dateHired;

    Employee() {
        MyDate date = new MyDate();
        office = "Eslam.";
        salary = 4000;
        dateHired = date.toString();
    }
    public String getOffice() {

        return office;
    }
    public void SetOffice(String office) {
        this.office = office;
    }  

    public int getSalary() {
        return salary;
    }
    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }
    public void SetDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    
    public String toString() { 
        return super.toString() + "Office Is : " + office + "\nSalary Is : "
                + salary + "$.\nDateHired Is : " + dateHired + ".\n";
    }
}
