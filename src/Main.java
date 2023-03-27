import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;
        ArrayList<Student> students = new ArrayList<>();

        do {

            System.out.println("+++++++++++++++++  Student Management System +++++++++++++++++");
            System.out.println("1. Insert Student");
            System.out.println("2. Edit Student info.");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show Student info.");
            System.out.println("6. Exit");

            boolean opValid = false;
            do {
                try {
                    System.out.print("Choose your option from 1 - 6 : ");
                    String stringOption = input.nextLine();
                    op = Integer.parseInt(stringOption);
                    opValid = true;
                } catch (Exception ex) {
                    System.out.println("ERROR!! TRY AGAIN.");
                }
            } while (!opValid);
            switch (op) {
                case 1:
                    System.out.println("+++++++++++++++++ Insert Student +++++++++++++++++");
                    Student newStudent = new Student();
                    newStudent.inputInfo();
                    students.add(newStudent);
                    System.out.println("STUDENT HAVE BEEN ADDED TO THE SYSTEM!");
                    break;
                case 2:

                    System.out.println("+++++++++++++++++ Update Student +++++++++++++++++");
                    System.out.print("Enter ID to Edit: ");
                    int editID = input.nextInt();
                    boolean isExist = false;
                    Student updatedStudent = new Student();
                    for (int i = 0; i < students.size(); i++) {
                        if (editID == students.get(i).id) {
                            isExist = true;
                            updatedStudent = students.get(i);
                            updatedStudent.updateStudent();
                            students.set(i, updatedStudent);
                            System.out.println("STUDENT HAVE BEEN UPDATED!");
                        }
                    }
                    if (!isExist) {
                        System.out.println("Student ID " + editID + " doesn't exist!");
                    }
                    input.nextLine();
                    break;
                case 3:
                    if(students.size()==0)
                        System.out.println("no students inside the system...!");
                    else {
                        int searchOp;
                        do {
                            System.out.println("+++++++++++++++++ Search Student +++++++++++++++++ ");
                            System.out.println("1. Search By ID ");
                            System.out.println("2. Search By Name ");
                            System.out.println("3. Search By Gender ");
                            System.out.println("4. Search By Classname");
                            System.out.println("5. Exit");
                            System.out.print("Choose your option from 1 to 5 : ");
                            searchOp = input.nextInt();

                            switch (searchOp) {
                                case 1:
                                    String searchID;
                                    boolean isIDExist = false;
                                    System.out.print("Enter ID to Search: ");
                                    input.nextLine();
                                    searchID = input.nextLine();
                                    for(int i = 0; i< students.size(); i++){
                                        if(searchID.equalsIgnoreCase(String.valueOf(students.get(i).id))){
                                            isIDExist = true;
                                            System.out.println(students.get(i));
                                        }
                                    }
                                    if(!isIDExist){
                                        System.out.println("There is no such ID...!");
                                    }
                                    break;
                                case 2:
                                    String searchName;
                                    boolean isNameExist = false;
                                    System.out.print("Enter name to Search: ");
                                    input.nextLine();
                                    searchID = input.nextLine();
                                    for(int i = 0; i< students.size(); i++){
                                        if(searchID.equalsIgnoreCase((students.get(i).name))){
                                            isIDExist = true;
                                            System.out.println(students.get(i));
                                        }
                                    }
                                    if(!isNameExist){
                                        System.out.println("There is no such Name...!");
                                    }
                                    break;
                                case 3:
                                    String searchGender;
                                    boolean isGenderExist = false;
                                    System.out.println("Search By Gender");
                                    System.out.print("Enter Gender to Search: ");
                                    input.nextLine();
                                    searchGender = input.nextLine();
                                    for(int i = 0; i< students.size(); i++){
                                        if(searchGender.equalsIgnoreCase(students.get(i).gender)){
                                            isGenderExist = true;
                                            System.out.println(students.get(i));
                                        }
                                    }
                                    if(!isGenderExist){
                                        System.out.println("Please choose female or male");
                                    }
                                    break;
                                case 4:
                                    String searchClass;
                                    boolean isClassExist = false;
                                    System.out.print("Enter Classroom to Search: ");
                                    input.nextLine();
                                    searchID = input.nextLine();
                                    for(int i = 0; i< students.size(); i++){
                                        if(searchID.equalsIgnoreCase((students.get(i).className))){
                                            isIDExist = true;
                                            System.out.println(students.get(i));
                                        }
                                    }
                                    if(!isClassExist){
                                        System.out.println("There is no such Class...!");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Exit the searching...! ");
                                    break;
                                default:
                                    System.out.println("1 to 5 only...! ");
                                    break;
                            }
                        } while (searchOp != 5);

                    }
                    input.nextLine();
                    break;
                case 4:
                    int deleteID;
                    boolean  isDeleteIDExist = false;
                    System.out.println("+++++++++++++++++ Remove Student +++++++++++++++++ ");
                    if(students.size()==0)
                        System.out.println("no student inside the system!! ");
                    else {
                        System.out.print("Enter Student ID to delete : ");
                        deleteID = input.nextInt();

                        for(int i = 0; i < students.size() ; i++){
                            if(deleteID == students.get(i).id){
                                isDeleteIDExist = true;
                                students.remove(i);
                                System.out.println("Student ID "+deleteID + " has been removed successfully...!");
                            }
                        }
                        if(!isDeleteIDExist){
                            System.out.println("Student ID "+deleteID+" doesn't exist...!");
                        }
                    }
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("+++++++++++++++++ Student Information List +++++++++++++++++ ");
                    if (students.size() == 0){
                        System.out.println("No records to show...!");
                    }else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exit from the program...!");
                    break;
                default:
                    System.out.println("Wrong Option ! 1 - 6 only!!");
            }
        } while (op!= 6);
    }


}
