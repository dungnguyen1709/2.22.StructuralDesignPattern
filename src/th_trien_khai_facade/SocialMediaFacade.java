package th_trien_khai_facade;

public class SocialMediaFacade {
    private Twitter twitter;
    private FaceBook faceBook;
    private Linkedln linkedln;

    public SocialMediaFacade(Twitter twitter, FaceBook faceBook, Linkedln linkedln) {
        this.twitter = twitter;
        this.faceBook = faceBook;
        this.linkedln = linkedln;
    }

    public void share(String message) {
        this.twitter.setMessage(message);
        this.faceBook.setMessage(message);
        this.linkedln.setMessage(message);
        this.twitter.share();
        this.faceBook.share();
        this.linkedln.share();
    }
}
