
import schedule.gui.ScheduleFrame;

public class Schedule {
    public static void main(String[] args){
        new Schedule().start();
        
    }
    private void start(){
        ScheduleFrame frame = new ScheduleFrame();
        frame.setVisible(true);
    }
}
