package TugasInterface;

public class MainInterface {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Flat Shoes", 1, 1500000);
        Invoice invoice2 = new Invoice("Dress", 1, 850000);
        Invoice[] invoices = {invoice1, invoice2};
        Employee employee = new Employee(280008, "Calista", 5000000, invoices);
        System.out.println("-------------------------------------------- \n" + "Informasi Karyawan \n");
        System.out.println(employee);
        System.out.println("Total gaji setelah dipotong hutang belanjaan: " + employee.getPayableAmount());
        System.out.println("--------------------------------------------------------------------- \n" + "Invoice Karyawan \n" );
        employee.displayInvoices();
        System.out.println("---------------------------------------------------------------------");
        }
}
