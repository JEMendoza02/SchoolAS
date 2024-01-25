/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.saes2;

import com.example.saes2.model.Subject;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author migue
 */
public class TableController implements Initializable {

    @FXML
    private VBox VBox;
    @FXML
    private VBox DataLayout;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Subject> datas = new ArrayList<>(datas());
        for (int i=0; i< datas.size() ; i++) {
            FXMLLoader fxm= new FXMLLoader();
            fxm.setLocation(getClass().getResource("datgp.fxml"));

            try {
            HBox hbox = fxm.load();
            DatgpController cic= fxm.getController();
            cic.setData(datas.get(i));
            DataLayout.getChildren().add(hbox);                
                
            } catch (IOException ex) {
               System.out.println(ex);
            }

        
        
        }
    }    
    private List<Subject> datas()
    {
        List<Subject> ls= new ArrayList<>();
        Subject data = new Subject();
        
        data.setName("TELEINFORMATICA");
        data.setArea("2NM52");
        data.setCalif1(10);
        data.setCalif2(10);
        data.setCalif3(8);
        data.setFinalScore(9);
        ls.add(data);

        data = new Subject();
        data.setName("ING DE REQUERIMIENTOS");
        data.setArea("3NV52");
        data.setCalif1(8);
        data.setCalif2(10);
        data.setCalif3(10);
        data.setFinalScore(9);
        ls.add(data);        
        
        data= new Subject();
        data.setName("AD. DE BASES DE DATOS");
        data.setArea("4NM79");
        data.setCalif1(10);
        data.setCalif2(10);
        data.setCalif3(10);
        data.setFinalScore(10);
        ls.add(data);   
        
        data= new Subject();
        data.setName("JAVA");
        data.setArea("4NM65");
        data.setCalif1(8);
        data.setCalif2(10);
        data.setCalif3(10);
        data.setFinalScore(9);
        ls.add(data);
                
        data= new Subject();
        data.setName("HABILIDADES DIRECTIVAS");
        data.setArea("4NM79");
        data.setCalif1(9);
        data.setCalif2(10);
        data.setCalif3(9);
        data.setFinalScore(9);
        ls.add(data);
        
        data= new Subject();
        data.setName("HERRAMIENTAS AUTOMATIZADAS");
        data.setArea("2CM42");
        data.setCalif1(10);
        data.setCalif2(10);
        data.setCalif3(10);
        data.setFinalScore(10);
        ls.add(data);
        
        return ls;
    }
}
