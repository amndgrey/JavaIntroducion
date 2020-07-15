import java.util.Scanner;

    public class Hw5 {

        static class Employee {

            String Name;
            String Profession;
            String email;
            long Telephone;
            long Salary;
            int Age;

            public Employee(String ivan_ivanov, String engineer, String s, String s1, int i, int i1) {

            }


            void GetData() {
                Scanner sc = new Scanner(System.in);

                System.out.print("\n\tEnter Employee Name : ");
                Name = sc.nextLine();

                System.out.print("\n\tEnter Employee Profession : ");
                Profession = sc.nextLine();

                System.out.print("\n\tEnter Employee email : ");
                email = sc.nextLine();

                System.out.print("\n\tEnter Employee Telephone : ");
                Telephone = Long.parseLong(sc.nextLine());

                System.out.print("\n\tEnter Employee Salary : ");
                Salary = Long.parseLong(sc.nextLine());

                System.out.print("\n\tEnter Employee Age : ");
                Age = Integer.parseInt(sc.nextLine());
            }


            void PutData()

            {
                System.out.print("\n\tEmployee Name : " + Name);
                System.out.print("\n\tEmployee Profession : " + Profession);
                System.out.print("\n\tEmployee email : " + email);
                System.out.print("\n\tEmployee Telephone : " + Telephone);
                System.out.print("\n\tEmployee Salary : " + Salary);
                System.out.print("\n\tEmployee Age : " + Age);
            }
        }


        public void Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age)
        {}
    }

    class Main {
        public static void main(String args[]) {


            Hw5.Employee[] E = new Hw5.Employee[5];

            E[0] = new Hw5.Employee("ivan ivanov", "Engineer", "ivanov@mailbox.com", "5675685685644", 120000, 36);
            E[1] = new Hw5.Employee("Antonio Banderas", "Actor", "banderaspapandreas@mail.ru", "8944389289", 100000, 50);
            E[2] = new Hw5.Employee("Chuck Norris", "Actor", "ChuckFu@yandex.ru", "856756755", 2000000, 78);
            E[3] = new Hw5.Employee("Silvestor Stalonij", "Actor", "RamboForeva@gmail.com", "8585858585", 1000000, 68);
            E[4] = new Hw5.Employee("Arnold Schwarznegger", "Actor", "janenegr@dmx.de", "453222534", 2500000, 70);


        }
    }

