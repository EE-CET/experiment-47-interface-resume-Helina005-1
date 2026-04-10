
   
        
      import java.util.Scanner;

// Create the interface
interface Resume {
    void biodata();
}

// Implement the interface in the Teacher class
class Teacher implements Resume {
    String name;
    String qualification;
    int experience;

    // Constructor to initialize the details
    public Teacher(String name, String qualification, int experience) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
    }

    // Implement the biodata method defined in the interface
    @Override
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the inputs
        String name = sc.nextLine().trim();
        String qualification = sc.nextLine().trim();
        int experience = sc.nextInt();

        // Create a Teacher object with the input data
        Teacher teacher = new Teacher(name, qualification, experience);

        // Call the biodata method to display the resume
        teacher.biodata();

        sc.close();
    }
}