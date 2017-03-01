import java.util.Date;

/**
 * Created by mike on 01.03.2017.
 */
public class GradeBook {
    Grade[] session1 = new Grade[20];
    Grade[] session2 = new Grade[20];
    Grade[] session3 = new Grade[20];
    Grade[] session4 = new Grade[20];


    public void addExamSession1(Date date, String title, int rate, GradeType type) {
        Grade grade = new Grade(date, title, rate, type);
        for (int i = 0; i < session1.length; i++) {
            if (session1[i] == null) {
                session1[i] = grade;
                break;
            }
        }
    }

    private class Grade {
        Date date;
        String subjectTitle;
        int rate;
        GradeType type;

        public Grade(Date date, String title, int rate, GradeType type) {
            this.date = date;
            this.subjectTitle = title;
            this.rate = rate;
            this.type = type;
        }

    }

}


