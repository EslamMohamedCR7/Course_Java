package EX11_02;

public class Student extends Person {

    private String freshman;
    private String sophomore;
    private String junior;
    private String senior;

    Student() {
        freshman = "Eslam.";
        sophomore = "Mohamed.";
        junior = "Abd Elsalam.";
        senior = "Ibrahim";
    }

    public String getFreshman() {
        return freshman;
    }

    public String SetFreshman(String freshman) {
        this.freshman = freshman;
        return this.freshman;
    }

    public String getSophomore() {
        return sophomore;
    }

    public void SetSophomore(String sophomore) {
        this.sophomore = sophomore;
    }

    public String getJunior() {
        return junior;
    }

    public void SetJunior(String junior) {
        this.junior = junior;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String toString() {

        return super.toString() + "Freshman Is : " + freshman + "\nSophomore Is : "
                + sophomore + "\nJunior Is : " + junior + " \nSenior Is : " + senior + ".\n";
    }

}
