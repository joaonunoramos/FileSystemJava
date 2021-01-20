package com.company.interfaces;

public interface IFileController {
    void changeName(String newName);
    void updateModifyDate();
    void changeOwner(IOwner newOwner);
    void updateDirectory(IDirectory newDirectory);
    void changeReadPermission();
    void changeWritePermission();
}
