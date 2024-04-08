package S05_ObjectOrientedProgramming_Inheritance;

public class L01_Main {

    public static void main(String[] args) {

        L01_Car car = new L01_Car();
        car.describeCar();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setConvertible(true);
        car.setDoors(2);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());

        car.describeCar();


        /*
        * Bank Account challenge
        * */

        L01_BankAccount bank = new L01_BankAccount("1234567890", 0, "Keshav", "tangri57@gmail.com", "1023456789");

        bank.withdrawAmount(100);
        bank.depositAmount(1245);
        bank.withdrawAmount(500);


        /*
        * Customer Challenge
        * */

        L01_Customer customer = new L01_Customer();
        System.out.println("Name : " + customer.getName() + ", Email : " + customer.getEmail() + ", Credit Limit : " + customer.getCreditLimit());

        customer = new L01_Customer("Zukayu", "zukayu@zukayu.com");
        System.out.println("Name : " + customer.getName() + ", Email : " + customer.getEmail() + ", Credit Limit : " + customer.getCreditLimit());

        customer = new L01_Customer("Zukayu", "Zukayu@zukayu.com", 500000);
        System.out.println("Name : " + customer.getName() + ", Email : " + customer.getEmail() + ", Credit Limit : " + customer.getCreditLimit());
        System.out.println(customer);


        /*
        * Understanding the POJO - Plain Old Java Object
        * */

        for(int i = 1; i <= 5; i++){

            L01_STUDENT_POJO student = new L01_STUDENT_POJO(
                    "STU-"+i,
                    switch (i){
                        case 1 -> "ABC";
                        case 2 -> "PQR";
                        case 3 -> "IJK";
                        case 4 -> "XYZ";
                        case 5 -> "LMN";
                        default -> "Anonymous";

                    },
                    "21/12/1998",
                    "Java Class"
            );


            System.out.println(student);

        }

        /*
        * Records in JAVA - SDK 16+ Only
        * */

        for(int i = 1; i <= 5; i++){

            L01_Student_RECORD student = new L01_Student_RECORD(
                    "STU-"+i,
                    switch (i){
                        case 1 -> "ABC";
                        case 2 -> "PQR";
                        case 3 -> "IJK";
                        case 4 -> "XYZ";
                        case 5 -> "LMN";
                        default -> "Anonymous";

                    },
                    "21/12/1998",
                    "Java Class"
            );


            System.out.println(student);

        }

        L01_Student_RECORD s1 = new L01_Student_RECORD("121", "Keshav Tangri", "21/12/1998", "Java MasterClass");


        /*
        * For a record, Java implicitly generates field with same name and type,
        * fields are declared private and final
        * toString method is generated as well!
        * public accessor with same name as the field but without any prefix get or set as shown below.
        * no setters because records are IMMUTABLE!
        * */
        System.out.println(s1.id());
        System.out.println(s1.name());
        System.out.println(s1.dateOfBirth());
        System.out.println(s1.classList());


    }

}
