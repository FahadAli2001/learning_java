class Employee{
    int id;
    String name;


    public void printDetails(){
        System.out.println("Name: " + name + " ID: " + id);
    }
}


public class classeslearning {
     public static void main(String[] args) throws Exception {
        Employee em = new Employee();
        em.id = 1;
        em.name = "Fahad";

        em.printDetails();
    }
}
