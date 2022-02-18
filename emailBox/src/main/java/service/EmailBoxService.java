package service;

import model.EmailBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailBoxService {
    private static Map<Integer,EmailBox> list=new HashMap<>();
    static {
        list.put(1,new EmailBox(1,"English","5",true,"thor"));
        list.put(2,new EmailBox(2,"Vietnamese","10",true,"captian"));
        list.put(3,new EmailBox(3,"Japanese","15",true,"iron man"));
        list.put(4,new EmailBox(4,"Chinese","20",true,"black"));
        list.put(5,new EmailBox(5,"Vietnamese","100",true,"hulk"));
    }
    public List<EmailBox> findAll(){
        return new ArrayList<>(list.values());
    }

    public EmailBox findById(int id){
        return list.get(id);
    }

    public void update(EmailBox emailBox){
        list.replace(emailBox.getId(), emailBox);
    }
}
