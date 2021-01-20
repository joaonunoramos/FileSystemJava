package com.company.interfaces;

public interface IFile {
    void changeName(String newName);
    void updateModifyDate();
    void updateDirectory(IDirectory newDirectory);
    void changeOwner(IOwner newOwner);
    void changeReadPermission();
    void changeWritePermission();
    String getName();
}
