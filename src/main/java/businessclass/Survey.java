package businessclass;

import java.io.Serializable;

public class Survey {
    private String hearAbout;
    private String announcementLike;
    private String announcementSend;
    private String contactMethod;

    public Survey() {
        hearAbout = "";
        announcementLike = "";
        announcementSend = "";
        contactMethod = "";
    }

    public Survey(String hearAbout, String announcementLike, String announcementSend, String contactMethod) {
        this.hearAbout = hearAbout;
        this.announcementLike = announcementLike;
        this.announcementSend = announcementSend;
        this.contactMethod = contactMethod;
    }

    public String getHearAbout() { return hearAbout; }
    public void setHearAbout(String hearAbout) { this.hearAbout = hearAbout; }

    public String getAnnouncementLike() { return announcementLike; }
    public void setAnnouncementLike(String announcementLike) { this.announcementLike = announcementLike; }

    public String getAnnouncementSend() { return announcementSend; }
    public void setAnnouncementSend(String announcementSend) { this.announcementSend = announcementSend; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }

}
