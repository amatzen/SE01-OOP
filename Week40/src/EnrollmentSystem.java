public class EnrollmentSystem {
    Student[] students;
    Course[] courses;

    public EnrollmentSystem(Student[] students, Course[] courses) {
        this.students = new Student[students.length];
        this.students = students;

        this.courses = new Course[courses.length];
        this.courses = courses;
    }

    public void enroll(Student std, Course crs) {
        crs.enroll(std);
    }

    public void unenroll(Student std, Course crs) {
        crs.unenroll(std);
    }

    public void showParticipants (Course crs) {
        for (Student std: crs.getParticipants()) {
            System.out.println(std.getName());
        }
    }

    public void showCourses() {
        for (Course crs: courses) {
            System.out.println(crs.getName());
        }
    }

    public void showStudents() {
        for (Student std: students) {
            System.out.println(std.getName());
        }
    }

    public void addStudent(Student std) {
        for (Student s: students) {
            if (std == s) {
                return;
            }
        }

        Student[] p = new Student[students.length + 1];

        for (int i = 0; i< students.length; i++) {
            p[i] = students[i];
        }
        p[students.length] = std;

        this.students = p;
    }

    public void removeStudent(Student std) {

        boolean exists = false;

        for (Student s: students) {
            if( s == std ) {
                exists = true;
            }
        }

        if(!exists) {
            return;
        }

        Student[] p = new Student[students.length - 1];

        for (int i = 0; i<students.length; i++) {
            if ( students[i] == std ) {
                students[i] = null;
                return;
            }
        }

        int c = 0;
        for (Student s: students) {
            if (s != null) {
                p[0] = s;
            }
        }

        this.students = p;
    }

    public void addCourse(Course crs) {
        for (Course s: courses) {
            if (crs == s) {
                return;
            }
        }

        Course[] p = new Course[courses.length + 1];

        for (int i = 0; i< courses.length; i++) {
            p[i] = courses[i];
        }
        p[courses.length] = crs;

        this.courses = p;
    }

    public void removeCourse(Course crs) {

        boolean exists = false;

        for (Course s: courses) {
            if( s == crs ) {
                exists = true;
            }
        }

        if(!exists) {
            return;
        }

        Course[] p = new Course[courses.length - 1];

        for (int i = 0; i<courses.length; i++) {
            if ( courses[i] == crs ) {
                courses[i] = null;
                return;
            }
        }

        int c = 0;
        for (Course s: courses) {
            if (s != null) {
                p[0] = s;
            }
        }

        this.courses = p;
    }

}
