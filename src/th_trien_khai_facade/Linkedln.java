package th_trien_khai_facade;

public class Linkedln implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Linkedln : " + this.message);
    }
}
