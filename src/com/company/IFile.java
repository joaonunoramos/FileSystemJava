package com.company;

import java.util.Date;

public interface IFile {
    String changeName(String newName);
    void updateModifyDate(Date newModDate);
    void changeOwner(IOwner newOwner);
    void changeReadPermission();
    void changeWritePermission();
}
