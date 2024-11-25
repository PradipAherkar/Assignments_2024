
// Create an array of Student objects and find the top scorer

    public class Student {
            private int rollNumber;
            private String name;
            private int marks;
        
            public Student(int rollNumber, String name, int marks) {
                this.rollNumber = rollNumber;
                this.name = name;
                this.marks = marks;
            }
        
            public int getMarks() {
                return marks;
            }
        
            public void displayDetails() {
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }
        
            public static void main(String[] args) {
                Student[] students = {
                    new Student(1, "Pratik", 85),
                    new Student(2, "Suyash", 90),
                    new Student(3, "Chaitanya",80)
                };
        
                Student topScorer = students[0];
                for (Student student : students) {
                    if (student.getMarks() > topScorer.getMarks()) {
                        topScorer = student;
                    }
                }
        
                System.out.println("Top Scorer:");
                topScorer.displayDetails();
               
    }
}