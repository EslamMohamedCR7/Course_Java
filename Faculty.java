package EX11_02;

public class Faculty extends Employee{

    private int officeHours;
    private int rank;

    Faculty() {
        officeHours = 9;
        rank = 157;
    }
    public int getOfficeHours() {
        return officeHours;
    }
    public void SetOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }
    public int getRank() {
        return rank;
    }
    public void SetRank(int rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return super.toString() + "OfficeHours Is : " + officeHours + ".\nRank Is : "
                + rank + ".\n";
    }
}
