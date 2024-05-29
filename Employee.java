//Main Class
public class Employee{
   private int empId;
   private String empName;
   private int empAge;
   private double empSalary;
//getter and setter method
 public int getEmpid(){
   return empId;
 }
public void setEmpId(int empId){
  this.empId=empId;
}
public String getEmpName(){
  return empName;
}
public void setEmpName(String empName){
  this.empName=empName;
}
public int getempAge(){
  return empAge;
}
public void setEmpAge(int empAge){
    this.empAge=empAge;
}
public double getEmpSalary(){
   return empSalary;
}
public void setEmpSalary(double empSalary){
   this.empSalary=empSalary;
}
public static void main(String args[]){
  Employee e=new Employee();
   e.setEmpId(1);
   e.setEmpName("kasthuri");
   e.setEmpAge(18);
   e.setEmpSalary(10000.0);
//Displaying the values using get method
System.out.println("employee Id:" +e.getEmpid());
System.out.println("employee Name:" +e.getEmpName());
System.out.println("employee Age:" + e.getempAge());
System.out.println("employee Salary:" +e.getEmpSalary());
}
}




