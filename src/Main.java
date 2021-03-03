public class Main {

    public static void main(String[] args) {
        Meeting m = new Meeting();
        String a1, a2, a3, a4;

        a1 = "02.01.1996";
        a2 = "07.05.1996";
        a3 = "03.01.1996";
        a4 = "02.01.1996";

        m.addMeeting(a1);
        m.addMeeting(a2);
        m.addMeeting(a3);

        for (String s : m.getMeeting()) {
            System.out.println(s);
        }
    }

}
