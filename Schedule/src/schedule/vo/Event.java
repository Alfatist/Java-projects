package schedule.vo;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import schedule.utils.FrequencyEnum;
public class Event implements Serializable {
    private Date eventDate;
    
    private String eventDesc;
    private FrequencyEnum frequency;
    private String sendEmail;
    private int alarm;
    
    public Event(){
        super();
    }

    public Event(Date eventDate, String eventDesc, FrequencyEnum frequency, String sendEmail, int alarm) {
        super();
        this.eventDate = eventDate;
        this.eventDesc = eventDesc;
        this.frequency = frequency;
        this.sendEmail = sendEmail;
        this.alarm = alarm;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public FrequencyEnum getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        return (date.format(this.getEventDate())) + ";" + this.getEventDesc() 
                + ";" + this.getFrequency() + ";" + this.getSendEmail() + ";" + 
                this.getAlarm();
    }
    
    
    
    
}
