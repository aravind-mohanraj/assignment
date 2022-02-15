import java.io.*;

class student {

    int roll;
    String cname;
    String uname;

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);

    void input() throws IOException {
        System.out.println("Enter Roll Number:");
        roll = Integer.parseInt(br.readLine());

        System.out.println("Enter College Name:");
        cname = br.readLine();
        System.out.println("Enter University Name:");
        uname = br.readLine();
    }
}


class marks extends student {
    int java_language, networks, web, maths, unix;


    void mark()  throws IOException{
        System.out.println("Enter java_language marks :");
        java_language = Integer.parseInt(br.readLine());

        System.out.println("Enter networks marks :");
        networks = Integer.parseInt(br.readLine());

        System.out.println("Enter web marks :");
        web = Integer.parseInt(br.readLine());

        System.out.println("Enter maths marks :");
        maths = Integer.parseInt(br.readLine());

        System.out.println("Enter unix marks :");
        unix = Integer.parseInt(br.readLine());
    }

    void total() {
        int total = java_language + networks + web + maths + unix;
        float percentage = ((total * 100)/500);
        System.out.println("\nMarks obtained in each subject:" +"\n java_language =" + java_language +"\n networks ="+ networks +"\n web ="+ web +"\n maths ="+ maths +"\n unix ="+ unix);
        System.out.println("\ntotal Number is :" + total);
        System.out.println("\nPercentage is :" + percentage);
    }

    void display() {
        System.out.println("\nRoll Number is :" + roll);
        System.out.println("\nCollege Name is :" + cname);
        System.out.println("\nUniversity Name is :" + uname);
    }

    public static void main(String args[]) throws IOException {
        marks c = new marks();
        c.input();
        c.mark();
        c.display();
        c.total();


    }
}