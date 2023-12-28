package utils;

import java.util.ArrayList;
import java.util.List;

import Human.Human;

public class CheckUserAge {
    public boolean IsTeenagerProp;
    public boolean IsAdultProp;
    public boolean IsRetiredProp;
    private ArrayList<Boolean> data;

    public CheckUserAge() {
        this.IsTeenagerProp = false;
        this.IsAdultProp = false;
        this.IsRetiredProp = false;

        this.data = new ArrayList<Boolean>();

    }

    public boolean IsTeenager(Human character) {
        return character.getAge() == 16;
    }

    public boolean IsAdult(Human character) {
        return character.getAge() == 21;
    }

    public boolean IsRetired(Human character) {
        return character.getAge() == 41;
    }

    public List getCheckedData (Human character) {
        this.data.clear();

        this.data.add(this.IsTeenager(character));
        this.data.add(this.IsAdult(character));
        this.data.add(this.IsRetired(character));

        return this.data;
    }
}
