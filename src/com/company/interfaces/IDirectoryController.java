package com.company.interfaces;

public interface IDirectoryController {
    void deleteFile(String nameFileToDelete);
    void deleteAllFiles();
    void deleteDirectory(String nameDirectoryToDelete);
    void deleteAllDirectories();
    void addFile(IFile newFile);
    void addDirectory(IDirectory newDirectory);
    void changeReadPermission();
    void changeWritePermission();
    void changeOwner(IOwner owner);
    void changeName(String newName);
}
