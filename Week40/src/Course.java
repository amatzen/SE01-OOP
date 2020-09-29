public class Course {
    private String name;
    private Student[] participants;

    public Course(String name) {
        this.name = name;
        this.participants = new Student[0];
    }

    public void enroll(Student std) {
        Student[] p = new Student[participants.length + 1];

        for (int i = 0; i< participants.length; i++) {
            p[i] = participants[i];
        }
        p[participants.length] = std;

        this.participants = p;
    }

    // https://en.wiktionary.org/wiki/unenroll
    public void unenroll(Student std) {

        boolean exists = false;

        for (Student s: participants) {
            if( s == std ) {
                exists = true;
            }
        }

        if(!exists) {
            return;
        }

        Student[] p = new Student[participants.length - 1];

        for (int i = 0; i<participants.length; i++) {
            if ( participants[i] == std ) {
                participants[i] = null;
                return;
            }
        }

        int c = 0;
        for (Student s: participants) {
            if (s != null) {
                p[0] = s;
            }
        }

        this.participants = p;
    }


    public Student[] getParticipants() {
        int c = 0;
        for (Student std: participants) {
            c++;
        }

        Student[] output = new Student[c];

        for (Student std: participants) {
            if (std != null) {
                output[(c - c++)] = std;
            }
        }

        return output;
    }

    public String getName() {
        return name;
    }
}
