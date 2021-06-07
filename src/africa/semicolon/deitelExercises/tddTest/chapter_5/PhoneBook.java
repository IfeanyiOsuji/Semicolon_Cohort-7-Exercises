package africa.semicolon.deitelExercises.tddTest.chapter_5;

import java.util.Arrays;

public class PhoneBook {
    private String name = "";

    public void setName(String name) {
        this.name += name+",";
    }

    public String search(String name) {
        String nameStored = "";
        String [] listOfNames = this.name.split(",");
        for(int i=0; i<listOfNames.length; i++){
                String [] contact = listOfNames[i].split(":");
            if(contact[0].equalsIgnoreCase(name))
                nameStored = listOfNames[i];
        }

        return nameStored;
    }

    public String edit(String formerName, String newName) {
        String nameStored = "";
        String [] listOfNames = this.name.split(",");
        for(int i=0; i<listOfNames.length; i++){
                String [] contact = listOfNames[i].split(":");
            if(contact[0].equalsIgnoreCase(formerName)) {
                contact[0] = newName;
                listOfNames[i] = contact[0]+":"+contact[1];
                nameStored = listOfNames[i];
            }
            //if(contact[1].equalsIgnoreCase())
        }
        return nameStored;
    }

    public String getname() {
        return name;
    }

    public String erase(String name, int index) {
        String nameStored = "";
        String [] listOfNames = this.name.split(",");
        for(int i=0; i<listOfNames.length; i++){
            if(listOfNames[i].equalsIgnoreCase(name) && i== index) {
                listOfNames[i] = "";
            }
        }
        for(int i=0; i< listOfNames.length; i++) {
               // listOfNames[i] = "";
                if(listOfNames[i].equalsIgnoreCase("") && i<listOfNames.length-1)
                            i++;
            nameStored += listOfNames[i] + " ";
        }
        return nameStored.trim();
    }
}
