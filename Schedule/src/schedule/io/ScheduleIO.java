package schedule.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import schedule.utils.FrequencyEnum;
import schedule.vo.Event;

public class ScheduleIO {
    private final String FOLDER = ".";
    private final String FILE = "events.txt";
    
    public void saveEvent(Event event)throws Exception{
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
            FOLDER, FILE), true));
            writer.write(event.toString(), 0, event.toString().length());
            writer.newLine();
            writer.close();
        }catch(FileNotFoundException fnfe){
            throw new Exception("File not found");
        }catch(Exception ex){
            throw new Exception("Error writing to file");
        }
    }
    public Vector<Vector<Object>> getEvents()throws Exception{
        Vector<Vector<Object>> list = new Vector<Vector<Object>>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(FOLDER, FILE)));
            String line = reader.readLine();
            while(line != null){
                Vector<Object> eventVector = new Vector<Object>();
                String[] tokens = line.split(";");
                eventVector.add(tokens[0]);
                eventVector.add(tokens[1]);
                eventVector.add(FrequencyEnum.valueOf(tokens[2]));
                eventVector.add(tokens[3]);
                eventVector.add(tokens[4].equals("1") ? "ON" : "OFF");
                
                list.add(eventVector);
                line = reader.readLine();
            }
            
            reader.close();
            
        }catch(FileNotFoundException fnfe){
            throw new Exception("File not found");
            
        }catch(Exception ex){
            throw new Exception("Error reading events file");
        }
        return list;
    }
}
