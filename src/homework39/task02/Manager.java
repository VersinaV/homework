package homework39.task02;

public class Manager extends Employee {

 public Manager(String name, double salary) {
   super(name, "Manager", salary);
 }

 public void makeOtherswork() {
   System.out.println(name + ": Everyone get back to work!!!");
 }

}
