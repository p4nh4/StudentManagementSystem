import java.util.Scanner;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String className;
    float score;

    public Student() {
    }
    public Student(int id, String name, String gender, int age, String className, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.className = className;
        this.score = score;
    }

    void inputInfo() {
        Scanner input = new Scanner(System.in);
        String idString;
        boolean idValid = false;
        do {
            try {
                System.out.print("Enter ID: ");
                idString = input.nextLine();
                id = Integer.parseInt(idString);
                idValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR!!Integer only..!");
            }
        } while (!idValid);
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Student Gender: ");
        gender = input.nextLine();

        String ageString;
        boolean ageValid = false;
        do {
            try {
                System.out.print("Enter Age: ");
                ageString = input.nextLine(); // no exception
                age = Integer.parseInt(ageString);
                ageValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR!!Integer only...!");
            }
        } while (!ageValid);


        System.out.print("Enter Student Classroom: ");
        className = input.nextLine();

        String scoreString;
        boolean scoreValid = false;

        do {
            try {
                System.out.print("Enter Student Score: ");
                scoreString = input.nextLine();
                score = Float.parseFloat(scoreString);
                scoreValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR!! Score cannot be String ...!");
            }
        } while (!scoreValid);
    }

    void updateStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student New Name: ");
        name = input.nextLine();
        System.out.print("Enter Student New Gender: ");
        gender = input.nextLine();

        String ageString;
        boolean isAgeValid = false;
        do {
            try {
                System.out.print("Enter New Age: ");
                ageString = input.nextLine();
                age = Integer.parseInt(ageString);
                isAgeValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR!! Age can only be Integer..!");
            }
        } while (!isAgeValid);
        System.out.print("Enter Student New Classroom: ");
        className = input.nextLine();

        String scoreString;
        boolean scoreValid = false;

        do {
            try {
                System.out.print("Enter Student New Score: ");
                scoreString = input.nextLine();
                score = Float.parseFloat(scoreString);
                scoreValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR!! Score can't be a String ...!");
            }
        } while (!scoreValid);
    }

    @Override
    public String toString() {
        return
                "id= " + id +"\t"+
                        "name=" + name +"\t"+
                        "gender=" + gender + "\t"+
                        "age=" + age +"\t"+
                        "className=" + className +"\t"+
                        "score=" + score;
    }
}
