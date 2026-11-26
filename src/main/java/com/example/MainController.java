package com.example;
import java.io.IOException;
import java.nio.file.Path;
import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeView;
import javafx.stage.DirectoryChooser;


public class MainController {
    @FXML
    private ListView<String> folderList;

    @FXML
    private MenuItem deleteFolderMenuItem;

    @FXML
    private Button addFolderButton;

    @FXML
    private TreeView<Path> fileTreeView;

    @FXML
    private TextArea previewArea;

    

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been completely loaded.
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("フォルダを選択");
        
        addFolderButton.setOnAction((e)->{
            File selectDir = chooser.showDialog(null);
            String selectDirPath = selectDir.getPath();
            System.out.println("パス："+ selectDirPath);
        });
    }
}
