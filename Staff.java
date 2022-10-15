package EX11_02;
public class Staff extends Employee{
    private String title;
    Staff(){
        title = "solom";
    }
    public String getTitle() {
        return title;
    }
    public void SetTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return super.toString() + "Title Is : " + title + ".\n";
    }

}
